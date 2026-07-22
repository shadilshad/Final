package DSA;

public class LinkedListFrontandBack {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertfront(10);
        list.insertfront(20);
        list.insertfront(30);
        list.insertfront(40);

        list.print();

        System.out.println("Size = " + list.size);
    }
}

class node {

    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    node head;
    int size = 0;

    void insertfront(int data) {

        node newNode = new node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    void print() {

        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}