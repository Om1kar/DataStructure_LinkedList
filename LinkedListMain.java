package LinkedList;

public class LinkedListMain {
    /*
   UC4-> Ability to delete first element in LinkedList from sequence 56 -> 30 -> 70
     */
    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();
        System.out.println("-----Welcome to Data Structure Linked List-----");
        list.add(56);
        list.add(30);
        list.add(70);

        list.pop();
        list.show();


    }
}