package llist;

public class Delete {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){data = d; next = null;}
    }

    /*
    * @params key the actual key value of the node
    * */
    void deleteNode(int key){
        Node temp = head;
        Node prev = null;

        // the llist is empty
        if (temp == null){
            return;
        }

        // the head is the one we wanna delete
        if (temp.data == key){
            // change the head
            head = temp.next;
            return;
        }

        // otherwise we just go through the node
        while (temp.data != key){
            // two nodes we're keeping track of
            // prev will be the one we're iterating through
            // temp will be the next of that
            prev = temp;
            temp = temp.next;
        }

        // do the actual deletion
        prev.next = temp.next;
    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }


    public static void main (String[] args){
        Delete llist = new Delete();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        // delete the node that holds the 1 key, NOT the index
        llist.deleteNode(1);

        llist.printList();
    }
}
