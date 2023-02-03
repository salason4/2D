package MultiThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        MyRunable runable1 = new MyRunable();

        Thread thread2 = new Thread(runable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); //wait till specify thread dies or for x amount of mmilseconds
        thread2.start();


        //System.out.println(1/0);

    }
}
