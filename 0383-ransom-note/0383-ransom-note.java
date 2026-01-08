class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        int i = 0;
        int count = 0;
        while(i < arr.length) {
            if(map.containsKey(arr[i])) {
                if(map.get(arr[i]) > 0) {
                    map.put(arr[i], map.get(arr[i]) - 1);
                    count++;
                }
            }
            i++;
        }
        return count == arr.length;
    }
}