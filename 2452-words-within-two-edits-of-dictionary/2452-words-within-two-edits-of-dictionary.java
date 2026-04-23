class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        int c = 0;
        while( c < dictionary.length){
            set.add(dictionary[c]);
            c++;
        }
        for(int i = 0; i < queries.length; i++){
            int val = 0;
            if(set.contains(queries[i])){
                list.add(queries[i]);
            } else{
                int j = 0;
                while(j < dictionary.length) {
                    val = 0;
                    int count = 0;
                    while (count < queries[i].length()) {
                        if (queries[i].charAt(count) != dictionary[j].charAt(count)) {
                            val++;
                        }
                        count++;
                    }
                    if (val <= 2) {
                        list.add(queries[i]);
                        break;
                    }
                    j++;
                }
            }
        }
        return list;
    }
}