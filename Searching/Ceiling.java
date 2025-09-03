package Searching;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        System.out.println("Ceiling Number is: "+Ceiling_Find(arr,target));
    }

    static int Ceiling_Find(int[] arr , int target){
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else
                return arr[mid];
        }
            return arr[start];
    }
}
