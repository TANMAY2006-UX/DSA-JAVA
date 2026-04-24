class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int Lcount = 0;
        int Rcount = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch =  moves.charAt(i);
            if(ch == '_'){
                count++;
            }
            else if(ch == 'L'){
                Lcount++;
            }
            else if(ch == 'R'){
                Rcount++;
            }
        }
        int n1 = 0;
        if(Lcount == Rcount || Lcount > Rcount){
            for (int i = 0; i < moves.length(); i++) {
                char ch = moves.charAt(i);
                if(ch == 'L' || ch == '_'){
                    n1++;
                }
                else {
                    n1--;
                }
            }
            return n1;
        }
        else{
            for (int i = 0; i < moves.length(); i++) {
                char ch = moves.charAt(i);
                if(ch == 'R' || ch == '_'){
                    n1++;
                }
                else {
                    n1--;
                }
            }
            return n1;
        }
    }
}