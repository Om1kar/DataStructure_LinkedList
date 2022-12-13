package LinkedList;

public class LinkedListMain {
    /*
   UC-7> Ability to search node from linked lists
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(30);
        list.add(70);
        list.show();

        list.searchNode(70);
        list.searchNode(30);
        list.searchNode(40);

    }
}