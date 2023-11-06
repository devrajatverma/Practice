package multi_threading;

public class Data {
    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean sending = true;

    public synchronized void send(String packet) {
        while (!sending) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        sending = false;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive() {
        while (sending) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        sending = true;

        String returnPacket = packet;
        notifyAll();
        return returnPacket;
    }

}