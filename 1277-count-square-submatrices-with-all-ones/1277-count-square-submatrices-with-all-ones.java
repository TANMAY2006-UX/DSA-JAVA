class Solution {
    int m,n;
    int solve(int i, int j, int[][] matrix,int[][] memo){

        if(i >= m || j >= n) return 0;

        if(matrix[i][j] == 0) return 0;

        if(memo[i][j] != -1) return memo[i][j]; 

        int right = solve(i , j + 1, matrix,memo);
        int dia = solve(i + 1, j + 1, matrix,memo);
        int down = solve(i + 1, j, matrix,memo);
        
        return memo[i][j] = 1 + Math.min(right,Math.min(dia,down));
    }

    public int countSquares(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int sum = 0;
        int[][] memo = new int[m][n];

        for(int i = 0;i < m; i++){
            for(int j = 0; j < n;j++){
                memo[i][j] = -1;
            }
        }

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                sum += solve(i, j, matrix,memo);
            }
        }
        return sum;
    }
}