package BT18.hienthisochanle;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            if (i%2==0){
                System.out.println(" các số chẵn là " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
