class Solution {
    public static String intToRoman(int num) {
        int temp = num;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while(temp != 0) {
            if(temp < values[i]) {
                i++;
            }
            else{
                sb.append(symbols[i]);
                temp -= values[i];
            }
        }
        return sb.toString();
    }
}