class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        int s = q.size();
        q.add(x);

        for(int i = 0; i < s; i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        if(empty()) return -1;
        else{
            int rem = q.peek();
            q.remove();
            return rem;
    }
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size() > 0) return false;
        else 
            return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */