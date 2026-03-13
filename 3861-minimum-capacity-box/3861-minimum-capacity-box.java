class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0 ; i < capacity.length ; i++){
            if(capacity[i] >= itemSize){
                if(capacity[i] < min){
                    index = i;
                    min = capacity[i];
                }
            }
        }
        return index;
    }
}