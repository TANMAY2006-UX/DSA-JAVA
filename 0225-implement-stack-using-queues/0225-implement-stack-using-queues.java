class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    Queue<Integer> temp;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() != 1){
            q2.add(q1.poll());
        }
        int rem = q1.poll();
        temp = q1;
        q1 = q2;
        q2 = temp;
        return rem;
    }
    
    public int top() {
        while(q1.size() != 1){
            q2.add(q1.poll());
        }
        int top = q1.peek();
        q2.add(q1.poll());
        temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    
    public boolean empty() {
            return q1.isEmpty();
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