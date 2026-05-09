class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int j = 0;
        int min = Integer.MAX_VALUE;
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].length() < min){
                min = strs[i].length();
                j = i;
            }
        }
        String LCP = strs[j];
        j = 0;
        for(int i = 0 ; i < strs.length ; i++){
            j = 0;
            if(strs[i].equals(LCP)){
                continue;
            }
            while(j < min){
                if(!LCP.isEmpty() && strs[i].charAt(j) != LCP.charAt(j)){
                    LCP = LCP.substring(0,j);
                    min = LCP.length();
                    j = 0;
                    break;
                }
                j++;
            }
        }
        return LCP;
    }
}