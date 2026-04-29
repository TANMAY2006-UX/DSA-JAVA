class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int count = 0;
        int maxReach = 0;
        int temp = 0;

        for(int i = 0 ; i < nums.length - 1; i++){
            maxReach = Math.max(maxReach,nums[i] + i);
            if(i == temp){
                count++;
                temp = maxReach;
            }
        }
        return count;
    }
}