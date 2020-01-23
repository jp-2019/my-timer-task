import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MySecondTimer {
    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        Timer timer = new Timer();
        timer.schedule(task1, 20000);
        timer.schedule(task2, 1000, 2000);

    }

    private static class Task extends TimerTask {
        String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(" [" + new Date() + "] " + name + " :task executed!");
        }
    }
}