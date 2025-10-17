class Solution {
    static int largestAltitude(int[] gain) {
        int[] num = new int [gain.length + 1];
        num[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            num[i+1] = num[i] + gain[i];
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}