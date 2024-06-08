package Steque;


public class Steque<Item> {
    // Node class 
    private class Node {
        Item item;
        Node next;
        Node prev;
        
        Node(Item item) {
            this.item = item;
        }
    }

    private Node front; // front of the steque
    private Node rear; // rear of the steque
    private int size; // size of the steque

    // Constructor 
    public Steque() {
        front = null;
        rear = null;
        size = 0;
    }

    //push operation
    public void push(Item item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    //pop operation
    public Item pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty");
        }
        Item item = front.item;
        front = front.next;
        if (front == null) {
            rear = null; // If the steque becomes empty, set rear to null
        } else {
            front.prev = null;
        }
        size--;
        return item;
    }

    //enqueue operation
    public void enqueue(Item item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    // Method to check if the steque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the steque
    public int size() {
        return size;
    }

    // Main method
    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();

        // push operation
        steque.push(1);
        steque.push(2);
        steque.push(3);
        
        System.out.println("---------------------------------");
        System.out.println("Push 1 , 2 , 3");
        System.out.println("---------------------------------");
        
        System.out.println("Size after pushes: " + steque.size());
        System.out.println("---------------------------------");
        
        //pop operation
        System.out.println("Popped item: " + steque.pop()); 
        System.out.println("Popped item: " + steque.pop()); 
        System.out.println("---------------------------------");
        System.out.println("Size after pop: " + steque.size()); 
        System.out.println("---------------------------------");
        
        System.out.println("enqueue 4 , 5");
        System.out.println("---------------------------------");
        
        // enqueue operation
        steque.enqueue(4);
        steque.enqueue(5);
        System.out.println("Size after enqueue: " + steque.size()); 
        System.out.println("---------------------------------");

        // pop operation again
        System.out.println("Popped item: " + steque.pop()); 
        System.out.println("Popped item: " + steque.pop()); 
        System.out.println("Popped item: " + steque.pop()); 
        System.out.println("---------------------------------");

        // Checking if the steque is empty
        System.out.println("Is steque empty? " + steque.isEmpty()); 
        System.out.println("---------------------------------");
        
    }
}
