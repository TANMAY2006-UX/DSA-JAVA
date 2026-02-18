class Solution {
    public boolean isPalindrome(int x) {
        int[] digits = intToDigitArray(x); 
        int i = 0;
        int j = digits.length - 1;

        while(i < j){
            if(digits[i] != digits[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
     private int[] intToDigitArray(int num) {

        char[] chars = String.valueOf(num).toCharArray();

        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i] - '0'; 
        }
        return result;
    }
}