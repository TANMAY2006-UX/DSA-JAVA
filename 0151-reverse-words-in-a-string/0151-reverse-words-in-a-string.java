class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        String[] temp = s.split(" ");
        for(int i = temp.length - 1; i >= 0; i--){
            if(!temp[i].equals(" ") && !temp[i].isEmpty()) {
                ans.append(temp[i] + " ");
            }
        }
        return ans.toString().trim();
    }
}