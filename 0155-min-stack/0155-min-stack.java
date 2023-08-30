class MinStack {
    private Node dummy;
    
    public MinStack() {
        this.dummy = new Node(0, Integer.MAX_VALUE, null);
    }
    
    public void push(int val) {
        int min = Math.min(dummy.min, val);
        dummy = new Node(val, min, dummy);

        System.out.println("min = " + min);
        System.out.println("1 dummy = " + dummy);
    }
    
    public void pop() {
        dummy = dummy.head;
        System.out.println("2 dummy = " + dummy);
        // System.out.println("2 dummy.data = " + dummy.data);
    }

    public int top() {
        return dummy.data;
    }
    
    public int getMin() {
        return dummy.min;
    }
    
    private static class Node {
        int data;
        int min;
        Node head;
        
        public Node(int data, int min, Node head) {
            this.data = data;
            this.min = min;
            this.head = head;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */