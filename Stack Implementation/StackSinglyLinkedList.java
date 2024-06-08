package stack;
import java.util.Scanner;

public class StackSinglyLinkedList {
	
	// Top of the stack
    private Node top; 
    // Size of the stack
    private int size;

    // Inner class to define a node
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = top; // Link the new node to the top
        top = newNode; // Update the top to the new node
        size++; // Increment the size of the stack
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        int data = top.data; // Get the data from the top
        top = top.next; // Move the top to the next node
        size--; // Decrement the size of the stack
        return data;
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        return top.data; // Return the data of the top node
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//get stack size
    	System.out.print("Enter your stack Size = ");
    	int size=sc.nextInt();
    	//create stack
        StackSinglyLinkedList stack = new StackSinglyLinkedList();
        
      //push operation
        for(int i = 0; i<size; i++) {
        	System.out.printf("Enter your Number %d to push  =",i+1 );
        	int num=sc.nextInt();
        	stack.push(num);
        }
      //using stack operations
        System.out.println("---------------------------------");
        System.out.println("Top element is: " + stack.peek()); 
        System.out.println("Stack size is: " + stack.size()); 
        System.out.println("---------------------------------");
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("---------------------------------");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size()); 
        
        System.out.println("---------------------------------");
        sc.close();
    }
}

