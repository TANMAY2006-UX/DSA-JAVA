class Solution {
    public int minCapability(int[] nums, int k) {
        // Step 1: Define the search space (Minimum and Maximum possible Capability)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Step 2: Binary Search on the "Capability" value
        int low = min, high = max;
        int result = max; // Store the best answer found so far

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if it is possible to rob k houses with capability 'mid'
            if (isPossible(nums, k, mid)) {
                result = mid;     // This capability works! Can we find a smaller one?
                high = mid - 1;   // Try lower half
            } else {
                low = mid + 1;    // This capability is too small. We need a higher limit.
            }
        }
        
        return result;
    }

    // The Helper Function (Greedy Approach)
    // Returns TRUE if we can rob at least 'k' houses with values <= limit
    private boolean isPossible(int[] nums, int k, int limit) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If this house is cheap enough to rob...
            if (nums[i] <= limit) {
                count++; // Rob it!
                i++;     // SKIP the next house (Adjacency Rule)
            }
            
            // Optimization: If we already found k houses, stop early
            if (count >= k) return true;
        }
        
        return count >= k;
    }
}