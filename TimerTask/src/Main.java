import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        //  Timer  =  A facility for threads to schedule tasks
        //            for future execution in a background thread

        //  TimerTask  =  A task that can be scheduled for one-time
        //                or repeated execution by a Timer

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int counter = 10;

            public void run(){
                if(counter>0){
                    System.out.println(counter "");

                }

            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2020);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.DAY,20);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task,0);
        timer.schedule(task,date.getTime());
        timer.scheduleAtFixedRate(task,0,1000);

    }
}
