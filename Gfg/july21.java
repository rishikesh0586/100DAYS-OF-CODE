class Solution
{
    public static Node reverse(Node head, int k)
    {
        Node current = head;
        Node prevTail = null;
        boolean firstGroup = true;
        
        while (current != null) {
            int count = 0;
            Node groupHead = current;
            Node prev = null;
            
            // Reverse the current group of size k
            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }
            
            // At the end of the first group, update the head of the reversed list
            if (firstGroup) {
                head = prev;
                firstGroup = false;
            }
            
            // If there's a previous tail, link it to the new group's head
            if (prevTail != null) {
                prevTail.next = prev;
            }
            
            // Update the previous tail to the tail of the current group
            prevTail = groupHead;
        }
        
        return head;
    }
}
