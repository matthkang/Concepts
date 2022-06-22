package llist;

public class AddToMiddle {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){data = d; next = null;}
    }

    /*
    * @params prev_node previous node from where to add after
    * @params new_data the value of the new node
    *
    * This method is also O(1) as the operation will be the same for each llist. We're not having to iterate through any linkedlist.
    */
    public void insertAfter(Node prev_node, int new_data){

        // check and see that we are not at the end of the linked list. We just want to add in the middle of the llist
        if (prev_node.next == null){
            System.out.println("Can't enter at the end of llist");
            return;
        }

        //similar to adding at the beginning
        Node new_node = new Node(new_data);

        // add in front of previous.next
        new_node.next = prev_node.next;

        // the previous node.next should now point to this new node to complete the list
        prev_node.next = new_node;

    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }


    public static void main (String[] args){
        AddToMiddle llist = new AddToMiddle();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.insertAfter(second, 4);

        llist.printList();
    }
}
