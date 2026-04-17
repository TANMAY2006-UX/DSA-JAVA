class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        int diff = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices.length == 1){
                return 0;
            }
            if(prices[i] >= max){
                max = prices[i];
            }
            else if(prices[i] < min){
                min = prices[i];
                max = prices[i];
            }
            diff = Math.max(max-min,diff);
        }
        return diff;
    }
}