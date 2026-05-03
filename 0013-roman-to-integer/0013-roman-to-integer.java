class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i < s.length() - 1 && c == 'I' && s.charAt(i + 1) == 'X') {
                sum += map.get("IX");
                i++;
            } else if (i < s.length() - 1 && c == 'I' && s.charAt(i + 1) == 'V') {
                sum += map.get("IV");
                i++;
            } else if (i < s.length() - 1 && c == 'X' && s.charAt(i + 1) == 'L') {
                sum += map.get("XL");
                i++;
            } else if (i < s.length() - 1 && c == 'X' && s.charAt(i + 1) == 'C') {
                sum += map.get("XC");
                i++;
            } else if (i < s.length() - 1 && c == 'C' && s.charAt(i + 1) == 'D') {
                sum += map.get("CD");
                i++;
            } else if (i < s.length() - 1 && c == 'C' && s.charAt(i + 1) == 'M') {
                sum += map.get("CM");
                i++;
            }else if (map.containsKey(c+"")) {
                sum += map.get(c+"");
            }
        }
        return sum;
    }
}