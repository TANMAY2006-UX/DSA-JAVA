class Solution {
    public String pushDominoes(String dominoes){
        String s = "L" + dominoes + "R";
        
        StringBuilder res = new StringBuilder();
        int i = 0;
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) == '.') continue;
            
            int middleDots = j - i - 1;
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            
            if (i > 0) {
                res.append(leftChar);
            }
            
            if (leftChar == rightChar) {
                for (int k = 0; k < middleDots; k++) res.append(leftChar);
            
            } else if (leftChar == 'L' && rightChar == 'R') {
                for (int k = 0; k < middleDots; k++) res.append('.');
            
            } else {
                for (int k = 0; k < middleDots / 2; k++) res.append('R');
                if (middleDots % 2 == 1) res.append('.');
                for (int k = 0; k < middleDots / 2; k++) res.append('L');
            }
            i = j;
    }
    return res.toString();
}
}
