import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    private Queue<Integer> q;
    private int capacity;

    private ProducerConsumer(int cap) {
        q = new LinkedList<>();

        capacity = cap;

    }

    public boolean add(int item) throws InterruptedException {

        synchronized (q) {
            while (q.size() == capacity) {
                q.wait();
            }
            q.add(item);
            q.notifyAll();
            return true;
        }

    }

    public int remove() {
        synchronized (q) {
            while (q.size() == 0) {
                //do something
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();
            return element;
        }
    }

}

