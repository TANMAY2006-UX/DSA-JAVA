package Arrays;

public class Wealth_1672 {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        int result = maximumWealth(accounts);
        System.out.println("Output: " +result);
    }


    static int maximumWealth(int[][] accounts){

        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(result < sum){
                result = sum;
            }
        }
        return result;
    }
}
