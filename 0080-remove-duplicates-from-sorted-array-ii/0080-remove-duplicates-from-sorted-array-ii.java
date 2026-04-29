class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int i = 0;
        int j = 1;
        int c = 0;
        int p = 0;

        while(j < nums.length){
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            c = j - i;
            if(c > 2){
                c = 2;
            }
            while(c!=0){
                nums[p] = nums[i];
                p++;
                c--;
            }
            i = j;
            //j++;
        }
        return p;
    }
}