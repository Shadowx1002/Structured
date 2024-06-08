package stack;

import java.util.Scanner;

public class DoublyLinkedListStack {
	// Top of the stack
    private Node top; 
    // Size of the stack
    private int size; 

    // Node class to represent elements in the stack
    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Constructor 
    public DoublyLinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    // Push operation to add an element to the top of the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            newNode.next = top;
            top.prev = newNode;
        }
        top = newNode;
        size++; // Increment size
    }

    // Pop operation to remove and return the element at the top of the stack
    public int pop() {
        if (isEmpty()) {
        	System.out.println("Stack is Empty");
        }
        int data = top.data;
        top = top.next;
        if (top != null) {
            top.prev = null;
        }
        size--; // Decrement size
        return data;
    }

    // Peek operation to return the element at the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return top.data;
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
        DoublyLinkedListStack stack = new DoublyLinkedListStack();
        
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
