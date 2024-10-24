import java.util.LinkedList;
import java.util.Queue;

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}

public class CustomerQueue {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();

        // Adding customers to the queue
        queue.add(new Customer("John"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("David"));
        queue.add(new Customer("Sophia"));

        System.out.println("Customer Queue: " + queue);

        // Serving customers
        while (!queue.isEmpty()) {
            Customer served = queue.poll();
            System.out.println("Serving customer: " + served);
            System.out.println("Queue after serving: " + queue);
        }
    }
}
