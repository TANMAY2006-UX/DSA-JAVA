class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        int maxReach = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if(maxReach > i){
                if(maxReach >= nums.length - 1){
                    return true;
                }
            }
            else if (nums[i] == 0){
                return false;
            }
        }
        return maxReach > nums.length - 1;
    }
}