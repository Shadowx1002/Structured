package SinglyLinkedList1;

public class SinglyLinkedList {
    // Node class 
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Constructor (create empty list)
    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert Method (insert a new node to end of the list)
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete Method 
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // head node delete
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Traverse the list to find the delete node
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // If the node to be deleted is found
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    // print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " - ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Linked list: ");
        list.printList();

        System.out.println("\nDeleting 3 from the list.\n");
        list.delete(3);

        System.out.println("Linked list after deletion:");
        list.printList();
    }
}

