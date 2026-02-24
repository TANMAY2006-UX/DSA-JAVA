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
        q2.add(x);
        while(q1.size() != 0){
            q2.add(q1.poll());
        }
        temp = q1;
        q1 = q2;
        q2 = temp;

    }
    
    public int pop() {
        if(empty()) return -1;
        else{
            return q1.remove();
    }
    }
    
    public int top() {
        return q1.peek();
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