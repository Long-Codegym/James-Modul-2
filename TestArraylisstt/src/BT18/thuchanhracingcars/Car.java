package BT18.thuchanhracingcars;

import java.util.Random;

import static BT18.thuchanhracingcars.Main.DISTANCE;
import static BT18.thuchanhracingcars.Main.STEP;

public class Car implements  Runnable{
    // khai báo tên xe
    private String nameCar;

    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public void run() {
        // khởi tạo km bắt đầu
      int startKm = 0;
      // time bắt đầu cuộc đua
        long timeStart = System.currentTimeMillis();
       // kiểm tra xem còn xe nào chưa kết thúc quãng đường
       while (startKm < DISTANCE){
            try {
                int speed = (new Random().nextInt(20));
                startKm += speed;
                String log = " | ";
                int percentTravel = (startKm*100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i+=STEP) {
                    if (percentTravel >= i + STEP){
                        log += "=";
                    } else if (percentTravel >= i && percentTravel<i + STEP) {
                        log += "o";
                    }else {
                        log +="_";
                    }
                }
                log +="|";
                System.out.println(" Car " + this.nameCar + ": " + log + " " + Math.min(DISTANCE, startKm) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.nameCar +" broken...");
                break;
            }
       }
       long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.nameCar + "Finish in" + (endTime - timeStart)/ 1000 + "S");
    }


}
