package DoublyLinkedList;

public class DLList {
    static Node head;
    static Node tail;


    static class Node{
        int value;
        Node next;
        Node previous;

    }

    public static void addFront(int value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            tail = node;
        }else{
            node.next = head;
            head.previous = node;
        }
        head = node;
    }

    public static void reverse(){
        Node temp = null;
        Node current = head;
        while(current != null){
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }
        if (temp != null){
            head = temp.previous;
        }
    }
    public static void print(){
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }
}
