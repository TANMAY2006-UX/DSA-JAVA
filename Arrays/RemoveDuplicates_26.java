package Arrays;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println("Unique Numbers " + k);
    }

        static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int i = 0; // Slow pointer

            for (int j = 1; j < nums.length; j++) { // Fast pointer
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }

            return i + 1;
        }
    }
