//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Deadlock {
    public static void main(String[] args) {

        String lock1="Mehroz";
        String lock2="Ahmad";

        System.out.println("Main is starting ");
        Thread thread1= new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Lock is acquired");

                }
            }
        } ,"thread1");
        Thread thread2=new Thread(()->{
            synchronized (lock2){
                try {
                    //thread1.join();
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Lock is acquired");
                }
            }
        }, "thread2");









        //Runnable thread2=new Thread2();
        //thread1.setDaemon(true);
        thread1.start();
        thread2.start();


        System.out.println("Main is exiting");


    }
}