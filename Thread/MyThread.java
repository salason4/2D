package Thread;

public class MyThread extends Thread {
    @Override
    public  void run (){
        if (this.isDaemon()){
            System.out.println("This is Demon thread running! ");
        }
        else {
            System.out.println("this is User Thread is running! ");
        }
    }

}
