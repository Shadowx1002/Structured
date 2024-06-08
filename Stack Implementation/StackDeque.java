package stack;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {
	// Deque to store stack elements
    private Deque<Integer> stack; 

    // Constructor
    public StackDeque() {
        stack = new ArrayDeque<>();
    }

    // Push an element onto the stack
    public void push(int item) {
        stack.push(item); // Push item onto the deque
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        return stack.pop(); // Pop item from the deque
    }

    // Peek top element of the stack without removing it
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
        	System.out.println("Stack is Empty");
        }
        return stack.peek(); // Peek item from the deque
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//get stack size
    	System.out.print("Enter your stack Size = ");
    	int size=sc.nextInt();
    	
    	//create stack 
        StackDeque stack = new StackDeque();
        
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

