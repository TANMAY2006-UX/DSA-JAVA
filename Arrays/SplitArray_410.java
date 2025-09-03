package Arrays;

public class SplitArray_410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println("Max : " + splitArray(arr,2));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        // Linear search for finding max and summation in an array
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,i);
            end += nums[i];
        }

        while(start <= end){
            int pieces = 1;
            int sum = 0;
            int mid = start + (end - start)/2;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else
                    start += num;
            }
            if(pieces > k)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
}
