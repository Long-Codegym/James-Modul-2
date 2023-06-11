package BT18.hienthisochanle;

public class OddThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            if (i%2==1){
                System.out.println(" các số lẻ " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
