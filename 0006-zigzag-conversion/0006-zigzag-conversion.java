class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int i = 0;
        int j = 0;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder("");
        }
        i = 0;
        StringBuilder current = new StringBuilder();
        int dir = 0;
        while (j < s.length()) {
            sb[i].append(s.charAt(j));
            j++;
            if(i == numRows - 1){
                dir = -1;
            }
            else if(i == 0){
                dir = 1;
            }
            i += dir;
        }

        for (int k = 0; k < numRows; k++) {
            current.append(sb[k]);
        }

        return current.toString();
    }
}