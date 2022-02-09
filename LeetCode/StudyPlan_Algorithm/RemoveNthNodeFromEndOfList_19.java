package LeetCode.StudyPlan_Algorithm;

public class RemoveNthNodeFromEndOfList_19 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        int[] vals = {1, 2, 3, 4, 5, 6};
        int n = 3;
        int nodeCnt = 0;
        ListNode head = new ListNode(vals[0], new ListNode(vals[1]));
        ListNode node = head;
        for (int i = 2; i < vals.length; i++) {
            node = node.next;
            node.next = new ListNode(vals[i]);
        }
        node = head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
            nodeCnt++;
        }
        if(nodeCnt==n){
            head=head.next;
            return;
        }
        System.out.println("\n"+"nodeCnt : "+nodeCnt);
        node = head;
        int idx=0;
        while (node!=null) {
            System.out.print(node.val + ", ");
            idx++;
            if (idx == nodeCnt-n) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        System.out.println("\n"+"result : ");
        node=head;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
    }
}

// final submission
// happy memory	: 0 ms / 40.7 MB

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode node = head;
//        int nodeCnt = 0;
//        while (node != null) {
//            node = node.next;
//            nodeCnt++;
//        }
//        if(nodeCnt==n){
//            head=head.next;
//            return head;
//        }
//        node = head;
//        int idx=0;
//        while (node!=null) {
//            idx++;
//            if (idx == nodeCnt-n) {
//                node.next = node.next.next;
//                break;
//            }
//            node = node.next;
//        }
//        return head;
//    }
//}