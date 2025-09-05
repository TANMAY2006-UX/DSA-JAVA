package Arrays;

import java.util.Arrays;

public class OnePlus_66 {
    static int[] plusOne(int[] digits) {
        int[] nums = new int[digits.length];
        int sum = 0;

        for(int i = 0; i<digits.length; i++){
            sum = digits[i] + sum * 10;
        }
        sum += 1;
        int n = nums.length - 1;
        if(nums.length == 1 && sum == 10 ||sum == 100 || sum == 1000){
            int[] arr = new int[digits.length + 1];
            int k = arr.length - 1;
            while (k >= 0){
                arr[k] = sum % 10;
                sum /= 10;
                k--;
            }
            return arr;
        }
        else if(nums.length == 1 && sum < 10){
            while (n < nums.length){
                nums[n] = sum % 10;
                sum /= 10;
                n++;
            }
        }

        while(n >= 0 && nums.length > 1){
            nums[n] = sum % 10;
            sum /= 10;
            n--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    }

