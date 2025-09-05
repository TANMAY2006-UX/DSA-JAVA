package Searching;

public class RotatedBS {

    static int search(int[] nums , int target){
        if(nums.length == 1){
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
        else{
            int value = 0;
            int count = 0;
            while(value < nums.length-1 && nums[value] < nums[++value]){
                count++;
            }
            if(nums[0] > target){
                int start = count + 1;
                int end = nums.length - 1;
                while(start <= end){
                    int mid = start + (end - start)/2;

                    if(nums[mid] > target)
                        end = mid - 1;
                    else if(nums[mid] < target)
                        start = mid + 1;
                    if(nums[mid] == target)
                        return mid;
                }
                return -1;
            }

            else{
                int start = 0;
                int end = value;
                while(start <= end){
                    int mid = start + (end - start)/2;

                    if(nums[mid] > target)
                        end = mid - 1;
                    else if(nums[mid] < target)
                        start = mid + 1;
                    if(nums[mid] == target)
                        return mid;
                }
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;
        System.out.println("Index is: " +search(arr,target));

    }
}
