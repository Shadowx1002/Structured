package StackUsingLinkedList;

public class StackUsingLinkedList {
    // Node class to represent each element in the stack
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor to create an empty stack
    public StackUsingLinkedList() {
        this.top = null;
    }

    // push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + data + " onto the stack.");
    }

    // pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        System.out.println("Popped " + poppedData + " from the stack.");
        return poppedData;
    }

    // peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return top.data;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to print the stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("\nStack elements: ");
        while (current != null) {
            System.out.print("\n" + current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

        System.out.println("\nTop element is " + stack.peek()+"\n");

        stack.pop();
        stack.pop();

        stack.printStack();
        System.out.println("\nTop element is " + stack.peek()+"\n");
    }
}

