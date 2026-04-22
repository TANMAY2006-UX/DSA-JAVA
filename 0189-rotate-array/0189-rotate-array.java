class Solution {
    public void rotate(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i != nums.length){
            stack.push(nums[i]);
            i++;
        }
        int[] arr = new int[nums.length];
        int rem = 0;
        if(nums.length != 1) {
            rem = k % nums.length;
            int count = rem - 1;
            while (count != -1) {
                arr[count] = stack.pop();
                count--;
            }
        }
            int temp = rem;
            for (int j = 0; j < nums.length - rem; j++) {
                arr[temp] = nums[j];
                temp++;
            }
        for(int j = 0 ; j < nums.length; j++){
            nums[j] = arr[j];
        }
    }
}