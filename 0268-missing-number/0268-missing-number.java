class Solution {
   static int missingNumber(int[] nums) {
        int min = nums[0] ,max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[i+1] > max){
                max = nums[i+1];
            }
            if(nums[i+1] < min){
                min = nums[i+1];
            }
        }

        int[] arr = new int[nums.length + 1] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < arr.length;j++) {
                if(arr[j] == nums[i]) {
                    arr[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i <= arr.length; i++) {
            if(arr[i] >= 0){
                return arr[i];
            }
        }
        return (max + 1);
    }
}