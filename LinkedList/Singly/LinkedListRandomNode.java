/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode head;
    private Random rand;

    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();  
    }
    
    public int getRandom() {
        int res = head.val;
        ListNode curr = head.next;
        int count = 1;
        while(curr!=null){
            count++;
            if(rand.nextInt(count) == 0){ //range -> [0, count-1] thus probabilty -> 1/count
                res = curr.val;
            }
            curr = curr.next;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
