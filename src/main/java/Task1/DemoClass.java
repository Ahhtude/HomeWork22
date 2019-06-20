package Task1;

public class DemoClass {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(()->{

            for (int i=1; i<6; i++) {
                try {

                    System.out.println(i);
                    Thread.sleep(5 * 1000);
                }

                catch (InterruptedException e) {
                    System.out.println("Was interruptedException");
                }
            }
        });
        thread.setName("First test thread.");
        thread.start();
        thread.join();
        while (!thread.isInterrupted()) {
            System.out.println(thread.getName() + " was END.");
            break;
        }

        }


}
