package Searching;

class Mountain_852 {

    static int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,5,2};
        System.out.println("Output: " + peakIndexInMountainArray(arr));
    }
}
