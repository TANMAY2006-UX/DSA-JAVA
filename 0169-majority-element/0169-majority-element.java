class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1)
            return nums[0];
        int i = 0;
        int j = 1;
        int count = 0;
        int max = 0;
        int num = 0;
        while(j < nums.length){
            if(nums[i] == nums[j]){
                count = j - i + 1;
            }
            else{
                i = j;
                count = 0;
            }
            if(max < count){
                num = nums[i];
                max = count;
            }
            j++;
        }
        return num;
    }
}