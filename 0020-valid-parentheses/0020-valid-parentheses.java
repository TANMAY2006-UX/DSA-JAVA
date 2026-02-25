class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        if(len == 1) return false;
        int count = 0;
        while (count < len){
            if(s.charAt(count) == '[' || s.charAt(count) == '{' || s.charAt(count) == '('){
                st.push(s.charAt(count));
            }
            else{
                char c = s.charAt(count);
                if(count != 0 && st.size() != 0){
                    if(st.peek() == '[' && c == ']' || st.peek() == '{' && c == '}' || st.peek() == '(' && c == ')'){
                        st.pop();
                    }
                    else
                        return false;
                }
                else 
                    return false;
            }
            count++;
        }
        if (st.size() == 0)
            return true;
        else
            return false;
    }
}