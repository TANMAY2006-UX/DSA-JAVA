class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int n = operations.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
                if(operations[i].equals("C")){
                    s.pop();
                }
                else if(operations[i].equals("+")){
                    int a = s.peek();
                    s.pop();
                    int temp = a + s.peek();
                    s.push(a);
                    s.push(temp);
                }
                else if(operations[i].equals("D")){
                    s.push(2*s.peek());
                }
                else{
                    int num = Integer.parseInt(operations[i]);
                    s.push(num);
                }
            }

        while(!s.isEmpty()){
            sum = sum + s.peek();
            s.pop();
        }
        return sum;
    }
}