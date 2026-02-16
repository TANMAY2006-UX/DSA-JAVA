class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length; // row count
        int n = matrix[0].length; // column count
        int sum = 0;
        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = 0;
            }
        }

        for(int j = 0;j<m;j++){
            dp[j][0] = matrix[j][0];
        }
        for(int j =0;j<n;j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i = 1 ; i<m; i++){
            for(int j = 1;j<n;j++){
                
                if(matrix[i][j] == 0) 
                    dp[i][j] = 0;
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1],dp[i][j-1]));
                }
            }
        }

        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                sum = sum + dp[i][j];
            }
        }
        return sum;
    }
}


/*

1 1 1 1           1  1  1  1     
1 1 0 1           1  2  0  2
1 1 1 1           1  2  3  3
1 1 1 1           1  2  3  4


*/