package unit16.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4); //[4,3,1,2]
        myLinkedList.printList();

       // System.out.println(myLinkedList.indexOf(1));
       // System.out.println(myLinkedList.indexOf(5));

        System.out.println(myLinkedList.valueOf(1));
        System.out.println(myLinkedList.valueOf(3));
        System.out.println(myLinkedList.valueOf(2));


        /* myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();
    */
    }

}
