import java.util.Queue;
import java.util.LinkedList;

public class QueuePractice {
    public static void main(String[] args) {
        // Creates a Queue using the LinkedList implementation.
        Queue<String> peopleQueue = new LinkedList<>();

        // Enqueue: Adds "Alice" to the back of the queue.
        peopleQueue.offer("Alice");
        // Enqueue: Adds "Bob" to the back of the queue.
        peopleQueue.offer("Bob");
        // Enqueue: Adds "Charlie" to the back of the queue.
        peopleQueue.offer("Charlie");
        // Enqueue: Adds "David" to the back of the queue.
        peopleQueue.offer("David");

        // Prints the current state of the entire queue.
        System.out.println("The queue is: " + peopleQueue);

        // Peek: Retrieves, but doesn't remove, the front element.
        System.out.println("The person at the front is: " + peopleQueue.peek());

        // Dequeue: Removes the element at the front ("Alice").
        peopleQueue.remove();
        // Prints the queue after the first removal.
        System.out.println("After removing one person, the queue is: " + peopleQueue);

        // Dequeue: Removes the new front element ("Bob").
        peopleQueue.remove();
        // Prints the queue after the second removal.
        System.out.println("After removing another person, the queue is: " + peopleQueue);

        // size() returns the number of elements left in the queue.
        System.out.println("The current size of the queue is: " + peopleQueue.size());

        // isEmpty() checks if the queue currently contains no elements.
        System.out.println("Is the queue empty? " + peopleQueue.isEmpty());
    }
}