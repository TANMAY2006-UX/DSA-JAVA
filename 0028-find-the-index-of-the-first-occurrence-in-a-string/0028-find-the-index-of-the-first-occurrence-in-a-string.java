class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int i = 0 ;
        int j = 0;
        int c = -1;
        while(j < needle.length() && i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(c == -1){
                    c = i;
                }
                i++;
                j++;
            }
            else{
                if(i == 0){
                    c = i;
                }
                if(c == -1){
                    c = i;
                }
                j = 0;
                i = c + 1;
                c = -1;
            }
        }
        if(j == needle.length())
            return c;
        else
            return -1;
    }
}