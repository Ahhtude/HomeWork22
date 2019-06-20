package Task2;

import java.util.Random;

public class DemoClass2 {
    public static void main(String[] args) {
        Thread aThread = Thread.currentThread();
        Thread bThread = new Thread(()->{
            try {

                System.out.println("Start b Thread");
                Thread.sleep(10*1000);

            } catch (InterruptedException e) {
                System.out.println("bThread was interupted");

            }
        });
        bThread.start();


        System.out.println("Start main Thread");
        Random random = new Random();

        int randomInt = 1 + random.nextInt(11-1);
        try {
            bThread.join(randomInt);
            if (bThread.isAlive()) {
                System.out.println("bThread was interupted in " + randomInt + " Seconds");
                bThread.interrupt();
            }
        }
            catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}