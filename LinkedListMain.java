package LinkedList;

public class LinkedListMain {
    /*
   UC-6> Ability to delete last element
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(30);
        list.add(70);

        list.popBack();
        list.show();


    }
}