class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i=0;i<strs.length;i++){
            String key = strs[i];
            char[] arr = key.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);

            map.computeIfAbsent(sorted,k ->new ArrayList<>()).add(key); //Lamda function: Saying Ki k koi input parameter hai jisme new arraylist apan bana rahe hai aur usko fill kar rahe hai
        }
        return new ArrayList<>(map.values());
    }
}
