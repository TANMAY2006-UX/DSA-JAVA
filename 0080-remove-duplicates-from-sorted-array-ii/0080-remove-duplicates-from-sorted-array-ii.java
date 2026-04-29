class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int c = 0;
        int p = 0;

        for(int i = 0; i < nums.length ; i++){
            if(p<2 || nums[i] != nums[p-2]){
                nums[c] = nums[i];
                c++;
                p++;
            }
        }
        return c;
    }
}