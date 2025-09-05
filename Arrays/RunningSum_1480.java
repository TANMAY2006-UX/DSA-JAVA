package Arrays;

import java.util.Arrays;

public class RunningSum_1480 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
            nums[i] = sum;
        }
        return nums;
    }
}


