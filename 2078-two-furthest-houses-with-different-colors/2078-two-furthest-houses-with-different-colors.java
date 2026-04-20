class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int j = n - 1;
        int i = 0;
        int count = 0;
        while(j > i){
            if(colors[i] == colors[j]){
                j--;
            }
            else{
                count = Math.max(count,Math.abs(i-j));
                j = n - 1;
                while(i < j){
                    if(colors[i] == colors[j]){
                        i++;
                    }
                    else{
                        return Math.max(count,Math.abs(i-j));
                    }
                }
            }
        }
        return 0;
    }
}