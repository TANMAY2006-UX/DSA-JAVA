class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        int first = 0;
        int second = 0;
        int flag = 0;
        for(int i = 0 ; i < tokens.length ; i++){
            int n;
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                n = Integer.parseInt(tokens[i]);
                s.push(n);
            }
            else if(tokens[i].equals("+")){
                s.push(s.pop() + s.pop());
            }
            else if(tokens[i].equals("-")){
                    first = s.pop();
                    second = s.pop();
                    first = second - first;
                    s.push(first);
            }
            else if(tokens[i].equals("*")){
                s.push(s.pop() * s.pop());
            }
            else if(tokens[i].equals("/")){
                    first = s.pop();
                    second = s.pop();
                    first = second / first;
                    s.push(first);
            }
        }
        return s.pop();
    }
}