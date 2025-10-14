class Solution {
 static int[] createTargetArray(int[] nums, int[] index) {
        int[] target  = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            int f = 0;
            int j = 0;
            while(j < index.length) {
                if (index[i] == index[j]) {
                    f++;
                    j++;
                }
                else
                    j++;
            }
            if(f == 1)
            {
                int temp = i;
                while (temp != index[i] && temp > 0) {
                    target[temp] = target[temp-1];
                    temp--;
                }
                target[index[i]] = nums[i] ;
            }
            else {
                int temp = i;
                while (temp != index[i] && temp > 0) {
                    target[temp] = target[temp-1];
                    temp--;
                }
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}