package Arrays;
class Solution {
    static int[] plusOne(int[] digits) {
        // Iterate from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is not 9, we can just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue the loop to handle the carry
            digits[i] = 0;
        }

        // This block is only reached if all digits were 9
        // E.g., [9, 9, 9] -> needs to become [1, 0, 0, 0]
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        // The rest of the elements in newDigits will be 0 by default
        return newDigits;
    }
}