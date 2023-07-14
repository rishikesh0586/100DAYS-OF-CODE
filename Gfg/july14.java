
class twoStacks {
    int arr[];
    int size;
    int top1, top2;

    twoStacks() {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }

    // Function to push an integer into stack1.
    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into stack2.
    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from the top of stack1.
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            //System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    // Function to remove an element from the top of stack2.
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            
            return -1;
        }
    }
}

