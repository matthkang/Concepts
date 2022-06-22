package llist;

public class AddFirst {
    // so you need this head so that you can know where to start in the linked list.
    // knowing where to start is helpful when iterating and adding, etc.
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){ data = d; next = null;}
    }

    // This process is the same for adding every element to the beginning of llist.
    // Thus it will be O(1)
    public void push(int new_data){
        Node new_node = new Node(new_data);

        // this moves it to the front. Links the next of this new node with head (which is the first node currently)
        new_node.next = head;

        // this moves to the head to the new node.
        // doesnt do anything to change current list
        head = new_node;

    }

    public void printList(){
        Node n = head;
        while (n!= null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main (String[] args) {
        AddFirst llist = new AddFirst();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.push(4);

        llist.printList();
    }
}
