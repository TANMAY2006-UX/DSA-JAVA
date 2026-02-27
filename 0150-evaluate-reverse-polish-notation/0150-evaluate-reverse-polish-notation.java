class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0 ; i < tokens.length ; i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                s.push(s.pop() + s.pop());
            } 
            else if (token.equals("*")) {
                s.push(s.pop() * s.pop());
            } 
            else if (token.equals("-")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first - second);
            } 
            else if (token.equals("/")) {
                int second = s.pop();
                int first = s.pop();
                s.push(first / second);
            } 
            else {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}