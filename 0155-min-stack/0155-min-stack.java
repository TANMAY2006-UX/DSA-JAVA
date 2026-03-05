class MinStack {

    private Stack<Long> stack;
    private Long mini;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int v) {
        long val = (long)v;
        if(stack.empty()){
            stack.push(val);
            mini=val;
        }
        else if(val>=mini){
            stack.push(val);
        }
        else{
            stack.push(2*val-mini);
            mini=val;
        }
    }
    
    public void pop() {
        long peek = stack.pop();
        if(peek>=mini) return;
        mini=2*mini-peek;
    }
    
    public int top() {
        long peek = stack.peek();
        if(peek>=mini) return (int)peek;
        return (int)(long)mini;
    }
    
    public int getMin() {
        return (int)(long)mini;
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