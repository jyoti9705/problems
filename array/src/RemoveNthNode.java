public class RemoveNthNode {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        ListNode curr = head;
        ListNode prev = null;
        int pos = length-n;
        if(pos==0){
            return head.next;
        }
        for (int i=0;i<pos;i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return head;
    }

    public int findLength(ListNode head) {
        int count = 0;
        if (head == null) {
            return count;
        }
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
