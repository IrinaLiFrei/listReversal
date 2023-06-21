import DoublyLinkedList.DLList;

public class Main {
    public static void main(String[] args) {


        DLList list = new DLList();
        for (int i = 1; i <= 10; i++) {
            list.addFront(i);
        }
        System.out.println();

        list.print();

        list.reverse();

        list.print();

    }
}