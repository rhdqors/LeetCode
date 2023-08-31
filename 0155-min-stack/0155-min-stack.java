// class MinStack {
//     private Node dummy;
    
//     public MinStack() {
//         dummy = new Node(Integer.MAX_VALUE, 0, dummy);
//     }
    
//     public void push(int val) {
//         int min = Math.min(dummy.min, val);
//         dummy = new Node(min, val, dummy);
//         // System.out.println("min = " + min);
//         // System.out.println("data = " + dummy.data);
//     }
    
//     public void pop() {
//         // System.out.println("pop = " + dummy.data);
//         dummy = dummy.next;
//     }
    
//     public int top() {
//         // System.out.println("top = " + dummy.data);
//         return dummy.data;
//     }
    
//     public int getMin() {
//         // System.out.println("getMin = " + dummy.min);
//         return dummy.min;
//     }
    
//     static class Node {
//         int min;
//         int data;
//         Node next;
        
//         Node(int min, int data, Node next) {
//             this.min = min;
//             this.data = data;
//             this.next = next;
//         }
//     }
// }


class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        int min = Math.min(getMin(), val);
        minStack.push(min);
        // System.out.println("stack = " + stack);
        // System.out.println("min = " + min);
        // System.out.println("minStack = " + minStack);
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
    
}