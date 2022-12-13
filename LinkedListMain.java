package LinkedList;

public class LinkedListMain {
    /*
   UC-9> Ability to delete 40 from the Linked Lists sequence of 56 -> 30 -> 40 -> 70
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(30);
        list.add(70);

        list.insertDataAtMid(40);
        System.out.println("List before deletion");
        list.show();
        list.popDeleteData(2);
        System.out.println("List after deletion");
        list.show();
        System.out.println("The size of list is = " + list.size());

    }
}