class Solution {
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int size = 0;
        int n = s.length();

        for(int i = 0 ; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(size > 0){
                    ans.append(ch);
                }
                size++;
            }
            else{
                size--;
                    if(size > 0){
                        ans.append(ch);
                    }
            }
        }
        return ans.toString();
    }
}