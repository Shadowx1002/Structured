package FIFO_queues;
import java.util.Scanner;

public class ArrayQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = this.size = 0;
        rear = capacity - 1;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
        	System.out.println("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Method to check the front item of the queue
    public int front() {
        if (isEmpty()) {
        	System.out.println("Queue is empty");
        }
        return queue[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	//get queue size
    	System.out.print("Enter your queue Size = ");
    	int size=sc.nextInt();
    	//create queue with user define size
    	ArrayQueue queue = new ArrayQueue(size);
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

