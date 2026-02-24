class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        
        s1.push(x);
    }
    
    public int pop() {
        if(s1.empty()) return -1;
        while(s1.size() != 1){
            s2.push(s1.pop());
        }
        int rem = s1.pop();
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return rem;
    }
    
    public int peek() {
        if(s1.empty()) return -1;
        while(s1.size() != 1){
            s2.push(s1.pop());
        }
        int top = s1.peek();
        while(s2.size() != 0){
            s1.push(s2.pop());
        }
        return top;
    }
    
    public boolean empty() {
        return (s1.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */