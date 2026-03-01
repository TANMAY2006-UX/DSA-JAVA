class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<>();
        int op1 , op2;
        for(String token : tokens)
        {
                switch(token){
                case "+":
                op2 = stk.pop();
                op1 = stk.pop();
                stk.push(op1+op2);
                break;

                case "-":
                op2 = stk.pop();
                op1 = stk.pop();
                stk.push(op1-op2);
                break;

                case "*":    
                op2 = stk.pop();
                op1 = stk.pop();
                stk.push(op1*op2);
                break;

                case "/":
                op2 = stk.pop();
                op1 = stk.pop();
                stk.push(op1/op2);
                break;

                default:
                stk.push(Integer.parseInt(token));
                }

            }
            return stk.pop();
        }
        
    }