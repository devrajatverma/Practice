package multi_threading;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data data;

    public Receiver(Data data) {
        this.data = data;
    }
    // standard constructors

    @Override
    public void run() {
        for (String receivedMessage = data.receive(); !"End".equals(receivedMessage); receivedMessage = data.receive()) {

            System.out.println(receivedMessage);

            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}