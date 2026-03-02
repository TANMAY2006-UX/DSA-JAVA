class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s1= new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums1.length];
        int k = nums2.length - 1;

        while(k >= 0){
            // while(!s1.isEmpty() && nums2[k] > s1.peek()){
            //     s1.pop();
            // }
            //     s1.push(nums2[k]);
            // k--;
            if(s1.isEmpty()){
                s1.push(-1);
            }
            while(nums2[k] > s1.peek() && s1.size() > 1){
                s1.pop();
            }
            map.put(nums2[k],s1.peek());
            s1.push(nums2[k]);
            k--;
        }

        for(int i = 0 ; i < nums1.length ; i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}