import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);


        int front = queue.peek();
        System.out.println("Front element: " + front);


        int removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}

