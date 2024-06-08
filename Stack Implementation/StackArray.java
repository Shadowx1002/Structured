package stack;
import java.util.Scanner;
public class StackArray {
	
	// Array to store stack elements
    private int stack[]; 
    // Index of the top element in the stack
    private int top; 
    // Maximum capacity of the stack
    private int capacity; 

    // Constructor 
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(int item) {
        if (top == capacity - 1) { // Check for stack overflow
            System.out.println("Stack is FUll");
        }
        stack[top=top+1] = item; // Increment top and add item to the stack
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check for stack is Empty
        	System.out.println("Stack is Empty");
        }
        return stack[top--]; // Return the top element and decrement top
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        return stack[top]; // Return the top element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	//get stack size
    	System.out.print("Enter your stack Size = ");
    	int size=sc.nextInt();
    	//create stack with user define size
        StackArray stack = new StackArray(size);
        //push operation
        for(int i = 0; i<size; i++) {
        	System.out.printf("Enter your Number %d to  push =",i+1 );
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
