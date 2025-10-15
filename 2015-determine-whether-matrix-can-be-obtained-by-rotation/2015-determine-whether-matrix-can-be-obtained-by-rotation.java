class Solution {
   static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        // We need to check for 0, 90, 180, and 270 degree rotations (up to 4 attempts).
        for (int k = 0; k < 4; k++) {

            // Check for a match with the current 'mat' state (0, 90, 180, or 270 degrees)
            boolean isMatch = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        isMatch = false;
                        break; // Stop checking this row
                    }
                }
                if (!isMatch) {
                    break; // Stop checking this matrix
                }
            }
            if (isMatch) {
                return true;
            }

            // If no match, perform a 90-degree clockwise rotation on 'mat'

            int[][] new_mat = new int[n][n];

            // The formula for 90-degree clockwise rotation is:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    new_mat[j][n - 1 - i] = mat[i][j];
                }
            }
            // The rotated matrix is now the 'mat' for the next loop iteration (the next check)
            mat = new_mat;
        }
        return false;
    }
}