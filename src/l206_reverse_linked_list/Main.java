package l206_reverse_linked_list;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
