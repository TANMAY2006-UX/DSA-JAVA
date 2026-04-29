class Solution {
    public int hIndex(int[] citations) {
        int count = 0;
        Arrays.sort(citations);
        for(int i = 0 ; i < citations.length; i++){
            if(citations[i] >= (citations.length - i)){
                count = Math.max(count,citations.length - i);
            }
        }
        return count;
    }
}