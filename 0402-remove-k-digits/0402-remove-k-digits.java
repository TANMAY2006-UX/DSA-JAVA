class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        char[] digits = num.toCharArray();
        Stack<Integer> s = new Stack<>();
        int count = 0 ;
        int i = 0;
        while(i < n) {
            char c = digits[i];
            int digit = c - '0';
            while(count != k && !s.isEmpty() && digit < s.peek())
            {
                s.pop();
                count++;
            }
            s.push(digit);
            i++;
        }
        while(count != k){
            s.pop();
            count++;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            String number = String.valueOf(s.peek());
            sb.append(number);
            s.pop();
        }
        sb.reverse();
        while(!sb.isEmpty() && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if (sb.isEmpty())
            return "0";
        else
            return sb.toString();
    }
}