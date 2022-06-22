package llist;

public class AddToEnd {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){data = d; next = null;}
    }

    /*
     * @params new_data the value of the new node
     *
     * This method is O(n)
     */
    public void append(int new_data){
        Node new_node = new Node(new_data);

        // check to see if the llist is empty...in that case, just set the new node as head
        if (head == null){
            head = new_node;

            //and then we're done lol
            return;
        }

        // let's just preset the next for this new node to null, bc its going to be at the end
        new_node.next = null;

        // otherwise we traverse the list until we reach the end, similar to outputting the llist
        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        last.next = new_node;

    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main (String[] args){
        AddToEnd llist = new AddToEnd();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

        llist.append(4);

        llist.printList();
    }
}
