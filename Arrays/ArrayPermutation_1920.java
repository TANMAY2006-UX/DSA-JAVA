package Arrays;

import java.util.Arrays;

public class ArrayPermutation_1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static  int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[nums[i]];
        }
            return arr;
    }
}
