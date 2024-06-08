package stack;
import java.util.Scanner;

public class StackLinkedList {
	// Top of the stack
    private Node head; 

    // Inner class to define a node
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Push an element onto the stack
    public void push(int item) {
        Node newNode = new Node(item); // Create a new node
        newNode.next = head; // Link the new node to the head
        head = newNode; // Update the head to the new node
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        int value = head.value; // Get the value from the head
        head = head.next; // Move the head to the next node
        return value;
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        return head.value; // Return the value of the head node
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get the size of the stack
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	//get stack size
    	System.out.print("Enter your stack Size = ");
    	int size=sc.nextInt();
    	//create stack 
        StackLinkedList stack = new StackLinkedList();
        
        //push operation
        for(int i = 0; i<size; i++) {
        	System.out.printf("Enter your Number %d to push =",i+1 );
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

