package QueueUsingLinkedList;

public class QueueUsingLinkedList {
    // Node class to represent each element in the queue
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Front and rear 
    private Node front;
    private Node rear;

    // Constructor to create an empty queue
    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    // add an element to the rear of the queue (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued " + data + " into the queue.");
    }

    // remove an element from the front of the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued " + dequeuedData + " from the queue.");
        return dequeuedData;
    }

    // peek at the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return front.data;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // print the queue elements
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("\nQueue elements: \n");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method 
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printQueue();

        System.out.println("\nFront element is " + queue.peek()+"\n");

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
        
        System.out.println("\nFront element is " + queue.peek()+"\n");
    }
}

