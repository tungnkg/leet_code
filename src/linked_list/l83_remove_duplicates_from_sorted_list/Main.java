package linked_list.l83_remove_duplicates_from_sorted_list;

import linked_list.ListNode;

public class Main {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        ListNode prev = null;
        Integer carry = null;
        while(currentNode != null){
            if(carry != null && carry == currentNode.val){
                currentNode = currentNode.next;
                prev.next = currentNode;
            }else{
                carry = currentNode.val;
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
