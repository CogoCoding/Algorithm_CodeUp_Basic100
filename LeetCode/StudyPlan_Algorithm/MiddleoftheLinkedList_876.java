package LeetCode.StudyPlan_Algorithm;

public class MiddleoftheLinkedList_876 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args){
        int[] vals = {1,2,3,4,5,6};
        ListNode head = new ListNode(vals[0],new ListNode(vals[1]));
        ListNode node=head;
        for(int i =2;i<vals.length;i++){
            node = node.next;
            node.next = new ListNode(vals[i]);
        }
        ListNode ans = Solution(head);
        while(ans!=null){
            ans=ans.next;
        }
    }


    public static ListNode Solution(ListNode head) {
        int nodeCnt = 0;
        ListNode node = head;
        while(node != null) {
            nodeCnt++;
            node = node.next;
        }
        int mid = nodeCnt/2+1;
        node = head;
        for (int i = 1; i < mid; i++) { node = node.next; }
        return node;
    }

    // SinglyLinkedList
    public class SinglyLinkedListNode<T> {

        private T element;
        private SinglyLinkedListNode<T> nextNode;

        public SinglyLinkedListNode(T element, SinglyLinkedListNode<T> next) {
            this.element = element;
            this.nextNode = next;
        }

        public T getElement() {
            return element;
        }

        public SinglyLinkedListNode<T> getNextNode() {
            return nextNode;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public void setNextNode(SinglyLinkedListNode<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

}

