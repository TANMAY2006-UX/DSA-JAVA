class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] nums = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == 'I'){
                nums[i] = low;
                low++;
            }
            else {
                nums[i] = high;
                high--;
            }
        }
        nums[n] = low;
        return nums;
    }
}