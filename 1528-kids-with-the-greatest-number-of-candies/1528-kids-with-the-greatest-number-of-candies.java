class Solution {
   static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int f = 1;
            for (int j = 0; j < candies.length; j++) {
                if(candies[i] + extraCandies < candies[j]){
                   f = 0;
                   break;
                }
            }
            if(f == 1){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}