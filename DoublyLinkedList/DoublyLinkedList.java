package DoublyLinkedList;

public class DoublyLinkedList {
    // Node class to doubly linked list
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head and tail 
    private Node head;
    private Node tail;

    // Constructor to create empty list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert Method
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete Method
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found in the list.");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Method to print the linked list in forward direction
    public void printListForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to print the linked list in backward direction
    public void printListBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Main method 
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked list in forward direction:");
        list.printListForward();

        System.out.println("Linked list in backward direction:");
        list.printListBackward();

        System.out.println("\nDeleting 30 from the list.\n");
        list.delete(30);

        System.out.println("Linked list in forward direction after deletion:");
        list.printListForward();

        System.out.println("Linked list in backward direction after deletion:");
        list.printListBackward();
    }
}
