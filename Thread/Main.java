package Thread;

public abstract class Main {
    public static void main(String[] args) throws InterruptedException {
       // System.out.println(Thread.activeCount());

       // Thread.currentThread().setName("Maiiiiiiin");
       // System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
        //System.out.println(Thread.currentThread().isAlive());
        /*for (int i =3; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are Done");*/
        //System.out.println(Thread.activeCount());

        MyThread thread = new MyThread();

        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
        thread.start();
        //System.out.println(thread.isAlive());

        //thread.setName("Thread2");
        //System.out.println(thread.getName());

        //thread.setPriority(1);
        //System.out.println(thread.getPriority());

    }


}
