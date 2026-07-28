package DSA;

public class DoublyCircularLinkedList2 {

    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    
    public void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }


    public void displayForward() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public void displayBackward() {

        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = tail;

        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println();
    }

    public static void main(String[] args) {

        DoublyCircularLinkedList2 list = new DoublyCircularLinkedList2();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertBeginning(5);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("Backward Display:");
        list.displayBackward();

        System.out.println("\nAfter Deleting First Node:");

        list.deleteFirst();

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("Backward Display:");
        list.displayBackward();
    }
}