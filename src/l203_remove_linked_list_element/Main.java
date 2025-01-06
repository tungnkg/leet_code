package l203_remove_linked_list_element;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        System.out.println(solve1(head, 6));
    }
    public static ListNode solve1(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode currentNode = head;
        ListNode prev = dummy;

        while(currentNode != null){
            if(currentNode.val == val){
                currentNode = currentNode.next;
                prev.next = currentNode;
            }else{
                prev = prev.next;
                currentNode = currentNode.next;
            }
        }
        return dummy.next;
    }
    public static ListNode solve2(ListNode head, int val) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        while(head != null){
            if(head.val != val){
                currentNode.next = new ListNode(head.val);
                currentNode = currentNode.next;
            }
            head = head.next;
        }
        return result.next;
    }
}
