class Solution {
    int m,n;

    public int countSquares(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int sum = 0;
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                arr[i][j] = 0;
            }
        }
        for(int i = 0;i < m; i++){
            arr[i][0] = matrix[i][0];
        }
        for(int i = 0; i < n;i++){
            arr[0][i] = matrix[0][i];
        }

        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n; j++){
                if(matrix[i][j] == 1)
                    arr[i][j] = 1 + Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                else
                    arr[i][j] = 0;
            
            }
        }

        for(int i = 0;i < m;i++){
            for(int j = 0;j<n;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

// 1 1 1 
// 1 1 1 
// 1 1 1 