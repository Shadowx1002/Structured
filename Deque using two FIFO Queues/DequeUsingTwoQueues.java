package DequeUsingTwoQueues;
import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoQueues {
	// Queue to handle the front end operations
    private Queue<Integer> frontQueue;
    // Queue to handle the back end operations
    private Queue<Integer> backQueue;  

    // Constructor
    public DequeUsingTwoQueues() {
        frontQueue = new LinkedList<>();
        backQueue = new LinkedList<>();
    }

    // Insert an element at the front of the deque
    public void addFirst(int item) {
        frontQueue.offer(item);
    }

    // Insert an element at the back of the deque
    public void addLast(int item) {
        backQueue.offer(item);
    }

    // Remove and return the element from the front of the deque
    public int removeFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        if (frontQueue.isEmpty()) {
            while (!backQueue.isEmpty()) {
                frontQueue.offer(backQueue.poll());
            }
        }
        return frontQueue.poll();
    }

    // Remove and return the element from the back of the deque
    public int removeLast() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        if (backQueue.isEmpty()) {
            while (!frontQueue.isEmpty()) {
                backQueue.offer(frontQueue.poll());
            }
        }
        return backQueue.poll();
    }

    // Peek at the element at the front of the deque without removing it
    public int peekFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        if (frontQueue.isEmpty()) {
            while (!backQueue.isEmpty()) {
                frontQueue.offer(backQueue.poll());
            }
        }
        return frontQueue.peek();
    }

    // Peek at the element at the back of the deque without removing it
    public int peekLast() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        if (backQueue.isEmpty()) {
            while (!frontQueue.isEmpty()) {
                backQueue.offer(frontQueue.poll());
            }
        }
        return backQueue.peek();
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return frontQueue.isEmpty() && backQueue.isEmpty();
    }

    // Get the size of the deque
    public int size() {
        return frontQueue.size() + backQueue.size();
    }
    
    

    public static void main(String[] args) {
    	
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();
        
        deque.addFirst(1);
        deque.addLast(4);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println("---------------------------------");
        System.out.println("First element: " + deque.peekFirst()); 
        System.out.println("Last element: " + deque.peekLast()); 
        
        System.out.println("Deque size: " + deque.size()); 
        System.out.println("---------------------------------");

        System.out.println("Removed first: " + deque.removeFirst()); 
        System.out.println("Removed last: " + deque.removeLast()); 
        System.out.println("---------------------------------");
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast()); 
        
        System.out.println("Deque size: " + deque.size()); 
        System.out.println("---------------------------------");
    }
}

