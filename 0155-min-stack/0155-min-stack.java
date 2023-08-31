class MinStack {
    private Node dummy;
    
    public MinStack() {
        dummy = new Node(Integer.MAX_VALUE, 0, dummy);
    }
    
    public void push(int val) {
        int min = Math.min(dummy.min, val);
        dummy = new Node(min, val, dummy);
        System.out.println("min = " + min);
        System.out.println("data = " + dummy.data);
    }
    
    public void pop() {
        System.out.println("pop = " + dummy.data);
        dummy = dummy.next;
    }
    
    public int top() {
        System.out.println("top = " + dummy.data);
        return dummy.data;
    }
    
    public int getMin() {
        System.out.println("getMin = " + dummy.min);
        return dummy.min;
    }
    
    static class Node {
        int min;
        int data;
        Node next;
        
        Node(int min, int data, Node next) {
            this.min = min;
            this.data = data;
            this.next = next;
        }
    }
}