class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = 0;
        int i = 0;
        int sum1 = 0;
        while(i < prices.length){
            if(prices[i] < min){
                if(max - min > 0)
                    sum = sum + max - min;
                min = prices[i];
                max = min;
            }
            else{
                if(prices[i] > max){
                    max = prices[i];
                    sum1 = sum + max - min;
                }
                else{
                    sum = sum + max - min;
                    min = prices[i];
                    max = min;
                }
            }
            i++;
        }
        return Math.max(sum,sum1);
    }
}