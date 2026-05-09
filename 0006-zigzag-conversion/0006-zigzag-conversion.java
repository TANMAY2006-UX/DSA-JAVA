class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int i = 0;
        int j = 0;
        Character[][] matrix = new Character[numRows][s.length()];
        int k = 0;
        while(k < s.length()) {
            while (i < s.length() && i < numRows && k < s.length()) {
                matrix[i][j] = s.charAt(k);
                i++;
                k++;
            }
            i--;
            j++;
            while (i > 0 && k < s.length()) {
                i--;
                matrix[i][j] = s.charAt(k);
                j++;
                k++;
            }
            j--;
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for(int l = 0; l < numRows; l++){
            for (int m = 0; m < matrix[l].length; m++) {
                if(matrix[l][m] == null) continue;
                sb.append(matrix[l][m]);
            }
        }
        return sb.toString();
    }
}