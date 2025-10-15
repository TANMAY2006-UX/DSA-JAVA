class Solution {
 static int[][] matrixReshape(int[][] mat, int r, int c) {

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] arr = new int[r][c];

        int count = 0;

        for (int i = 0; i < mat.length  ; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int newRow = count / c;
                int newCol = count % c;
                arr[newRow][newCol] = mat[i][j];
                count++;
            }
        }

        return arr;
    }
}