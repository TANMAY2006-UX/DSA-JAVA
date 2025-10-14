class Solution {
   static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            int f = 1;
            for (int i : candies) {
                if (candy + extraCandies < i) {
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