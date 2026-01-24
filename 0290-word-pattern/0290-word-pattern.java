class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = new String[26];
        HashSet<String> set = new HashSet<String>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {

            if(arr[pattern.charAt(i)-'a'] == null && !set.contains(words[i])){
                arr[pattern.charAt(i)-'a'] = words[i] ;
                set.add(words[i]);
            }
            else{
                if(!Objects.equals(arr[pattern.charAt(i) - 'a'], words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}