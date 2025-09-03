package Arrays;

import java.util.Arrays;

public class ShuffleArray_1470 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int l = 0;
        int length = nums.length;
        int[] arr = new int[length];
        for(int i = 0; i <= length ; i++){
            if(l < n){
                arr[i] = nums[l];
                l++;
                if(l < n)
                    i++;
                else
                    i = 0;
            }
            else {
                arr[i] = nums[l];
                i++;
                l++;
            }
        }
        return arr;
    }
}
