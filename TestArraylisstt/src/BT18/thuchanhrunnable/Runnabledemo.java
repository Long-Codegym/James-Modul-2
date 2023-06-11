package BT18.thuchanhrunnable;

public class Runnabledemo implements Runnable{
    // Thread kiểu luồng chạy
    private  Thread t;
    private  final  String threadName;

    public Runnabledemo( String name) {
        threadName = name;
        System.out.println(" Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println(" Running " + threadName);
        // dừng vào lặp trong bao nhiêu ms nhập vào đó theo ý mình
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println(" Thread " + threadName + " exitting.");
    }

    public void start(){
        System.out.println(" Starting " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
