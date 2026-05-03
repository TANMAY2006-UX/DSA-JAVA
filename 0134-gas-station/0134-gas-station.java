class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = -1;
        int sumg = 0;
        int sumc = 0;
        int i = 0;
        int tank = 0;
        int count = 0;
        while(i < gas.length){
            sumg += gas[i];
            i++;
        }
        i = 0;
        while(i < cost.length){
            sumc += cost[i];
            i++;
        }

        if(sumg >= sumc){
            if(gas.length == 1){
            return 0;
        }
            int j = 0;
            while(j < gas.length) {
                if (gas[j] > cost[j]){
                    start = j;
                    tank = tank + gas[j];
                }
                int temp = j;
                while (count != gas.length && tank > 0) {
                    tank = tank - cost[temp];
                    temp = (temp + 1) % gas.length;
                    if(tank >= 0) {
                        tank += gas[temp];
                        count++;
                    }
                    else{
                        count = 0;
                        tank = 0;
                    }
                }
                if (count == gas.length) {
                    return start;
                }
                j++;
            }
        }
        else{
            return start;
        }
        return start;
    }
}