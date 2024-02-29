public class InterruptedException_Demo extends Thread{

    public static void main(String[] args) throws InterruptedException {

        InterruptedException_Demo saat = new InterruptedException_Demo();
        saat.start();

        Thread.sleep(10000);
        saat.interrupt(); //10 saniye sonra durduracak


    }
public void run(){
        Thread current = Thread.currentThread();
        while(!current.isInterrupted()){
            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println(e.toString());
                break;
            }
            System.out.println("Tik Tak");
    }


}

}
        /*Thread saat =  Thread.currentThread();
        saat.start();
        Thread.sleep(10000);
        saat.interrupt();
        while (!saat.isInterrupted()){
        try {
        Thread.sleep(2000);

        }catch (InterruptedException e){
        System.out.println("Saat Durduruldu");
        break;
        }
        System.out.println("Tik Tak");*/



   /* Thread longSleepingThread = new Thread(() -> {
        try {
            // Simulating a long task with sleep
            System.out.println("Going to sleep...");
            Thread.sleep(10000);  // Sleep for 10 seconds
            System.out.println("Woke up normally!");
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            System.err.println("I was rudely interrupted while sleeping!");
        }
    });

        longSleepingThread.start();

                // Main thread will sleep for 2 seconds and then interrupt the longSleepingThread
                try {
                Thread.sleep(2000);
                } catch (java.lang.InterruptedException ignored) { }

                longSleepingThread.interrupt();*/


