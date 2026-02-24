// Gemini Answer But good one...
class MyQueue {
    Stack<Integer> input;  // s1 (Push here)
    Stack<Integer> output; // s2 (Pop/Peek from here)

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    // Amortized O(1) - Lazy move
    public int pop() {
        // If output is empty, we must refill it from input
        if (output.empty()) {
            transferInputToOutput();
        }
        return output.pop();
    }
    
    // Amortized O(1) - Lazy move
    public int peek() {
        // Same logic: ensure output has data
        if (output.empty()) {
            transferInputToOutput();
        }
        return output.peek();
    }
    
    public boolean empty() {
        // It's only empty if BOTH stacks are empty
        return input.empty() && output.empty();
    }

    // Helper function to handle the "Heavy" lifting
    private void transferInputToOutput() {
        while (!input.empty()) {
            output.push(input.pop());
        }
    }
}

/*
Your old code: Moves 1,2,3,4 to s2, pops 5... wait, actually pops 1 (if logic correct), then moves 2,3,4,5 back. A lot of work!

This code: Moves 5, 4, 3, 2, 1 into output. output is now [5, 4, 3, 2, 1]. Pops 1.

Now output is [5, 4, 3, 2].

The next time you call pop(), you just grab 2 directly from output. Zero movement needed!
*/

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */