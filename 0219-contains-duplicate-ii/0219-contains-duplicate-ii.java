class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        if(k==0) return false;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else {
                temp = map.get(nums[i]);
                if(i - temp <= k){
                    return true;
                }
                else {
                    map.remove(nums[i]);
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}