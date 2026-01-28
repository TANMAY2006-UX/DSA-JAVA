class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0)return true;

        String Alphanum = s.replaceAll("[^a-zA-Z0-9]","");
        Alphanum = Alphanum.toLowerCase();
        int i = 0;
        int j = Alphanum.length() - 1;

        while(i<=j){
            if(Alphanum.charAt(i)!=Alphanum.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}