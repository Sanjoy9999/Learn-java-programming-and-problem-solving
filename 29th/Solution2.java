//3 question
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }

}


public class Solution2{
    public boolean hosCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode hare = head;//fast
        ListNode turtle = head;//slow


        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }

            return false;
        }
    }
}