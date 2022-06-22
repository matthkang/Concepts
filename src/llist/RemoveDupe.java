package llist;

public class RemoveDupe {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while (head != null && head.next != null){
            if (head.val == head.next.val){
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }

        return tmp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        deleteDuplicates(head);
    }
}
