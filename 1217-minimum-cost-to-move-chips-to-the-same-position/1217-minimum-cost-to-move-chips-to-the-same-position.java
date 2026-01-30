class Solution {
    public int minCostToMoveChips(int[] position) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cost = 0;
        for(int i = 0; i < position.length; i++){
            map.put(position[i],map.getOrDefault(position[i],0)+1);
        }

        int evenChips = 0;
        int oddChips = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                evenChips += entry.getValue(); // Add the count of chips at this even position
            } else {
                oddChips += entry.getValue(); // Add the count of chips at this odd position
            }
        }
        return Math.min(evenChips, oddChips);
    }
}
