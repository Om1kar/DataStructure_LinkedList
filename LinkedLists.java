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

    public void searchNode(T data) {
        Node<T> current = head;
        int i = 1;
        boolean flag = false;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }

        }
        if (flag) {
            System.out.println("The Node with value "  + data +  " is present in the linked lists at the position = " + i);

        } else {
            System.out.println("Node with value "+data+" is not present in the linked lists");
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



