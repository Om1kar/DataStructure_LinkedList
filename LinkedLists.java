package LinkedList;

public class LinkedLists<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void pop() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
    }
    public void show() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}



