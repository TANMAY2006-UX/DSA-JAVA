class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        if(len == 1) return false;
        int count = 0;
        while (count < len){
            if(s.charAt(count) == '[')
                st.push(']');
            else if(s.charAt(count) == '{')
                st.push('}');
            else if(s.charAt(count) == '(')
                st.push(')');
            else{
                char c = s.charAt(count);
                if(count != 0 && st.size() != 0){
                    if(st.peek() == c){
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
        return st.isEmpty();
    }
}