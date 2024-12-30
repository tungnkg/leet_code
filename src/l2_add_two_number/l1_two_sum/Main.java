package l2_add_two_number.l1_two_sum;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }



    public static void main(String[] args) {

    }

    public ListNode solve(ListNode l1, ListNode l2) {
        ListNode result = new ListNode (0);
        ListNode tmpNode = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int data1 = l1 != null ? l1.val : 0;
            int data2 = l2 != null ? l2.val : 0;
            result.next = new ListNode((data1 + data2 + carry)  % 10);
            carry = (data1 + data2) / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            result = result.next;
        }
        if(carry == 1) tmpNode.next = new ListNode(1);
        return result.next;
    }
}
