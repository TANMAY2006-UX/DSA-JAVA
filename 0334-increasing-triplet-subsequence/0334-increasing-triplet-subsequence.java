class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length == 1 || nums.length == 2) return false;
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        int i = 1;
        while(i < nums.length){
            if(nums[i] < first){
                first = nums[i];
            }
            else if(nums[i] > first){
                if(nums[i] < second)
                    second = nums[i];
                else if(nums[i] > second)
                    return true;
            }
        i++;
        }
        return false;
    }
}