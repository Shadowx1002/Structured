package FIFO_queues;
import java.util.Scanner;

public class LinkedListQueue {
    private Node front, rear;
    private int size;

    // Node class to represent elements in the queue
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Constructor
    public LinkedListQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
        	System.out.println("Queue is empty");
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    // Method to check the front item of the queue
    public int front() {
        if (isEmpty()) {
        	System.out.println("Queue is empty");
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//get queue size
    	System.out.print("Enter your queue Size = ");
    	int size=sc.nextInt();
    	
        LinkedListQueue queue = new LinkedListQueue();
        
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

