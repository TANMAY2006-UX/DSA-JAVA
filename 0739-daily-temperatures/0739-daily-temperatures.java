class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] arr = new int[n];

        int i = n - 1;
        while(i >= 0){
                while(!s.isEmpty() && temperatures[i] >= temperatures[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty())
                    arr[i] = 0;
                else
                    arr[i] = s.peek() - i;
                s.push(i);
                i--;
                }
                return arr;
            }
        }