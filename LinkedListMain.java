package LinkedList;

public class LinkedListMain {
    /*
   UC3-> Ability to create Linked List by appending 30 and 70 to 56
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.append(56);
        list.append(30);
        list.append(70);
        list.show();

    }
}