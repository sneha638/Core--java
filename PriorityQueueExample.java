import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);


        int removed = pq.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Priority Queue after removal: " + pq);


        int front = pq.peek();
        System.out.println("Front element: " + front);
    }
}
