import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer Task started at " + new Date());
        completeTask();
        System.out.println("Timer Task completed at " + new Date());
    }

    private void completeTask(){
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TimerTask timerTask = new MyTimerTask();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*10000);
        System.out.println("TimerTask started");
        try {
            Thread.sleep(12000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
