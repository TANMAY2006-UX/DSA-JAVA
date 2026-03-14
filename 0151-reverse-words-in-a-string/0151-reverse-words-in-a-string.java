class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] temp = s.split(" +");
        for(int i = temp.length - 1; i >= 0; i--){
                ans.append(temp[i]);
                ans.append(" ");
        }
        return ans.toString().trim();
    }
}