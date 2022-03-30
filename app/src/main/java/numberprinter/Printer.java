package numberprinter;
import java.util.concurrent.*;

public class Printer implements Runnable {
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);

    public Printer(ArrayBlockingQueue<Integer> inputQueue) {
        queue = inputQueue;
    }

    public void run() {
        Integer number;
        while ( (number = queue.poll()) != null ) {
            System.out.println( "Thread id " + Thread.currentThread().getId() + ": " + number );
        }
    }
}
