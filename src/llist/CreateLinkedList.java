package llist;

public class CreateLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {data = d; }
    }

    public void printList(){
        Node n = head;
        //traversing llist
        while (n!= null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main (String[] args) {
        CreateLinkedList llist = new CreateLinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.printList();

    }

}
