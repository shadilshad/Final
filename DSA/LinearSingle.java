package DSA;

class Node { // Node class

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinearSingle {

    public static void main(String[] args) {

        // Creation of nodes
        Node head = new Node(10);
        Node anode = new Node(20);
        Node bnode = new Node(30);
        Node cnode = new Node(40);

        // Connecting the nodes
        head.next = anode;
        anode.next = bnode;
        bnode.next = cnode;

        // Traversing the linked list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}