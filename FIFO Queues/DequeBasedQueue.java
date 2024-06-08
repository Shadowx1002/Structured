package FIFO_queues;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeBasedQueue {
    private Deque<Integer> deque;

    // Constructor 
    public DequeBasedQueue() {
        deque = new LinkedList<>();
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        deque.offerLast(item);
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.pollFirst();
    }

    // Method to check the front item of the queue
    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.peekFirst();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//get queue size
    	System.out.print("Enter your queue Size = ");
    	int size=sc.nextInt();
    	
        DequeBasedQueue queue = new DequeBasedQueue();
        
        //enqueue to queue
        for(int i = 0; i<size; i++) {
         	System.out.printf("Enter your Number %d to push =",i+1 );
         	int num=sc.nextInt();
         	queue.enqueue(num);
         }
        
        System.out.println("---------------------------------");
        System.out.println("Front item is: " + queue.front()); 
        System.out.println("Dequeued item is: " + queue.dequeue()); 
        System.out.println("Front item is: " + queue.front()); 
        System.out.println("---------------------------------");
        sc.close();
    }
}

