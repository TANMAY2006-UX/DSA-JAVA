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

        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.peek());
            s.pop();
        }
        Collections.reverse(list);
        while(!list.isEmpty() && list.get(0) == 0){
            list.remove(0);
        }
        StringBuilder sb = new StringBuilder();
        for(int number : list){
            sb.append(number);
        }
        if (sb.isEmpty())
            return "0";
        else
            return sb.toString();
    }
}