class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length() > haystack.length()){
            return -1;
        }
        int j = 0;
        int c = -1;
        for(int i = 0; i < haystack.length(); i++){
            while(i < haystack.length() && haystack.charAt(i) == needle.charAt(j)){
                if(j == 0){
                    c = i;
                }
                i++;
                if(j == needle.length() - 1){
                    return c;
                }
                j++;
            }
            if(c != -1){
                j = 0;
                i = c;
                c = -1;
            }
        }
        if(j == needle.length()){
            return c;
        }
        else
            return -1;
    }
}