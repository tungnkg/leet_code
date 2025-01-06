package linked_list.l206_reverse_linked_list;

import linked_list.ListNode;

public class Main {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode prevNode = null;
        while(currentNode != null){
            ListNode prev = prevNode;
            prevNode = currentNode;
            currentNode = currentNode.next;
            prevNode.next = prev;
        }
        return prevNode;
    }
}
