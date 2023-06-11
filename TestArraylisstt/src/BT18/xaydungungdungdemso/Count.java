package BT18.xaydungungdungdemso;

public class Count implements Runnable{
    private Thread myThread;
    public void Count () {
        myThread = new Thread(this,"chay ngay di");
        System.out.println("My thread " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(" đếm " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" chạy đã kết thúc");
    }
}
