class Solution {
    public void reverseString(char[] s) {
        StringBuilder ans = new StringBuilder();

        for(int i = s.length - 1 ; i >= 0 ; i--){
            ans.append(s[i]);
        }

        String temp = ans.toString();
        for(int i = 0 ; i < s.length ; i++){
            char ch = temp.charAt(i);
            s[i] = ch;
        }
    }
}