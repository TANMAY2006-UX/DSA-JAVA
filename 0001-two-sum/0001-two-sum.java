class Solution {
        static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int i = 0;
            while(i<nums.length){
                int current = target - nums[i];
                if(hm.containsKey(current)){
                    return new int[]{hm.get(current), i};
                }
                hm.put(nums[i], i);
                i++;
            }
            return new int[]{-1, -1};
        }

}