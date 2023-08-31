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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */




// class MinStack {
//     private Node dummy;
    
//     public MinStack() {
//         this.dummy = new Node(0, Integer.MAX_VALUE, null);
//     }
    
//     public void push(int val) {
//         int min = Math.min(dummy.min, val);
//         dummy = new Node(val, min, dummy);

//         System.out.println("min = " + min);
//         System.out.println("1 dummy = " + dummy);
//     }
    
//     public void pop() {
//         dummy = dummy.head;
//         System.out.println("2 dummy = " + dummy);
//     }

//     public int top() {
//         return dummy.data;
//     }
    
//     public int getMin() {
//         return dummy.min;
//     }
    
//     private static class Node {
//         int data;
//         int min;
//         Node head;
        
//         public Node(int data, int min, Node head) {
//             this.data = data;
//             this.min = min;
//             this.head = head;
//         }
//     }
// }

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */