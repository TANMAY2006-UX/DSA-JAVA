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

        while (j < s.length()) {
            sb[i].append(s.charAt(j));
            j++;
            if(i == numRows - 1){
                while(j < s.length() && i > 0){
                    i--;
                    sb[i].append(s.charAt(j));
                    j++;
                }
                i++;
            }
            else{
                i++;
            }
        }

        for (int k = 0; k < numRows; k++) {
            current.append(sb[k]);
        }

        return current.toString();
    }
}