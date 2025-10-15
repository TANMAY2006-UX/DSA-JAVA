class Solution {
 static int diagonalSum(int[][] mat) {
        if(mat.length % 2 != 0 ){
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                    sum += mat[i][i];
                }
                int k = 0;
                for (int j = mat.length - 1; j >= 0; j--) {
                    sum += mat[k][j];
                    k++;
            }
            int index = mat.length / 2;
            return (sum - mat[index][index]);
        }
        else if(mat.length % 2 == 0){
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][i];
            }
            int k = 0;
            for (int j = mat.length - 1; j >= 0; j--) {
                sum += mat[k][j];
                k++;
            }
            return sum;
        }
        else {
            return mat[0][0];
        }
    }
}