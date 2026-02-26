class MinStack {
Stack<Integer> st;
Stack<Integer> temp;
int min;

    public MinStack() {
        st = new Stack<>();
        temp = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(val,min);
        temp.push(min);
        st.push(val);    
    }
    
    public void pop() {
        st.pop();
        temp.pop();
        if(!temp.empty())
            min = temp.peek();
        else
            min = Integer.MAX_VALUE;
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return temp.peek();
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