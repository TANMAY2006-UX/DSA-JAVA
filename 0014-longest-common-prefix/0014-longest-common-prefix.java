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
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i] == LCP){
                continue;
            }
            j = 0;

            while(j < min){
                char ch = strs[i].charAt(j);
                if(LCP.charAt(j) == ch){
                    sb.append(ch + "");
                }
                else{
                    break;
                }
                j++;
            }
            LCP = sb.toString();
            if(LCP == ""){
                return "";
            }
            min = LCP.length();
            if(i < strs.length - 1)
                sb.setLength(0);
        }
        return sb.toString();
    }
}