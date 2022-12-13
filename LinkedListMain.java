package LinkedList;

public class LinkedListMain {
    /*
   UC-8> Ability to insert 40 after 30 to linked lists
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(30);
        list.add(70);

        list.insertDataAtMid(40);
        list.show();


    }
}