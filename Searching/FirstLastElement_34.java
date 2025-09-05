package Searching;

import java.util.Arrays;

public class FirstLastElement_34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println("Array is: " + Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else {
                int first = mid;
                int last = mid;
                int temp = mid;
                while (nums[first] == target || nums[last] == target) {
                    if (nums[mid] == target) {
                        first = mid;
                        --mid;
                    }
                    else if (nums[temp] == target) {
                        last = temp;
                        temp++;
                    }
                    else
                        break;
                }
                return new int[]{first, last};

            }
        }
        return new int[]{-1, -1};
    }
}
