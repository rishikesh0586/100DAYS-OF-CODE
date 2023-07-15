//User function Template for Java
class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // Base case: If the stack is empty or we have reached the middle element
        if (s.isEmpty() || sizeOfStack == 0)
            return;

        // Recursive call to delete the middle element
        int midIndex = sizeOfStack / 2 + 1;
        deleteMidUtil(s, midIndex);

    }

    // Helper function to recursively delete the middle element
    private void deleteMidUtil(Stack<Integer> s, int current) {
        // Base case: If we have reached the middle element
        if (current == 1) {
            s.pop();
            return;
        }

        // Remove the current element and recur for the remaining stack
        int temp = s.pop();
        deleteMidUtil(s, current - 1);

        // Push the removed element back after recursion
        s.push(temp);
    }
}

