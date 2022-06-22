package llist;

public class Cycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        /*
            fast is head.next in the scenario where this only one value in the linked list:
            i.e. [1]
            slow is 1
            fast is null
         */
        ListNode fast = head.next;

        while (slow != fast){
            // will happen eventually if theres an end to the linked list
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main (String[] args){
        /*ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;*/
        ListNode head = new ListNode(1);

        boolean res = hasCycle(head);
        System.out.println(res);

    }
}
