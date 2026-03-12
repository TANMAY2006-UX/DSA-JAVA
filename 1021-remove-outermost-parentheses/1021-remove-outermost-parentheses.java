class Solution {
    public static String removeOuterParentheses(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        int n = s.length();

        for(int i = 0 ; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(!st.isEmpty()){
                    ans += st.peek();
                }
                st.push("(");
            }
            else{
                    st.pop();
                    if(!st.isEmpty()){
                        ans += ch;
                    }
            }
        }
        return ans;
    }
}