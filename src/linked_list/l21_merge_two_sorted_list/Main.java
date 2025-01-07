package linked_list.l21_merge_two_sorted_list;

import linked_list.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Main main = new Main();
        ListNode result = main.solve1(list1, list2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode solve1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                currentNode.next = list1;
                list1 = list1.next;
            }else{
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = (list1 !=null)?list1:list2;
        return dummy.next;
    }
    public ListNode solve2(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                currentNode.next = new ListNode(list1.val);
                currentNode = currentNode.next;
                list1 = list1.next;
            }else if(list1.val > list2.val){
                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
                list2 = list2.next;
            }else{
                currentNode.next = new ListNode(list1.val);
                currentNode = currentNode.next;
                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            currentNode.next = new ListNode(list1.val);
            currentNode = currentNode.next;
            list1 = list1.next;
        }
        while(list2 != null){
            currentNode.next = new ListNode(list2.val);
            currentNode = currentNode.next;
            list2 = list2.next;
        }
        return result.next;
    }
}
