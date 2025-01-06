package linked_list.l876_middle_of_linked_list;

import linked_list.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(solve1(head));
    }

    public static ListNode solve1(ListNode head) {
        int i = 0;
        ListNode currentNode = head;
        ListNode result = head;
        while(currentNode != null){
            i++;
            currentNode = currentNode.next;
        }
        int k = 0;
        while(k < i/2){
            result = result.next;
            k++;
        }
        return result;
    }

    public static ListNode solve2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
