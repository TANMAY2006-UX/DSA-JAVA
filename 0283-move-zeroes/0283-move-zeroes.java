class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i + 1;
        while (j < nums.length && i < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                    i++;
                }
                else{
                    while(j < nums.length && nums[j] == 0) {
                        j++;
                    }
                }
            }
            else{
                while(i < nums.length && nums[i] != 0) {
                    i++;
                }
                j = i + 1;
            }
        }
    }
}