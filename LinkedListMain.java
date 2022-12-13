package LinkedList;

public class LinkedListMain {
    /*
   UC4-> Ability to insert 30 between and 56 to 70.
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(70);

        list.insertData(30);
        list.show();

    }
}