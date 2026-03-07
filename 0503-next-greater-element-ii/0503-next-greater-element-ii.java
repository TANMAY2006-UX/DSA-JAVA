class Solution {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[nums.length];
        int temp = 2 * nums.length;
        Arrays.fill(arr, -1);
        
        int j = 1;
        if(s.isEmpty() && nums.length != 0){
            s.push(0);
        }
        while(!s.isEmpty() && j < temp){
            while(!s.isEmpty() && nums[j % nums.length] > nums[s.peek()]){
                arr[s.peek()] = nums[j  % nums.length];
                s.pop();
            }
            if(j < nums.length)
                s.push(j);
            j++;
        }
        return arr;
    }
}