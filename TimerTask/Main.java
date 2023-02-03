package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer time = new Timer();


        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if ( counter> 0){
                    System.out.println( counter + "seconds");
                    counter --;
                } else
                {
                    System.out.println("HAPPY NEW YEAR");
                time.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONTH,Calendar.FEBRUARY);
        date.set(Calendar.DAY_OF_MONTH,2);
        date.set(Calendar.HOUR_OF_DAY,1);
        date.set(Calendar.MINUTE,51);
        date.set(Calendar.SECOND,50);

        date.set(Calendar.MILLISECOND,0);
        //time.schedule(task, date.getTime());
        //time.schedule(task, 0);
        //time.scheduleAtFixedRate(task, 0, 1000);
        time.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}
