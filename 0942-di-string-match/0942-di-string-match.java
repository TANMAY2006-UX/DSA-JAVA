class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
            int[] nums = new int[n + 1];
            
            for (int i = 0; i <= n; i++) {
                nums[i] = i;
            }

            // Look for 'D'. When you find it, reverse that segment.
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'D') {
                    int start = i;
                    // Find how far the 'D's go
                    while (i < n && s.charAt(i) == 'D') {
                        i++;
                    }
                    // Reverse the numbers from 'start' to 'i'
                    reverse(nums, start, i);
                }
            }
            return nums;
        }

        public static void reverse(int[] arr, int i, int j) {
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
