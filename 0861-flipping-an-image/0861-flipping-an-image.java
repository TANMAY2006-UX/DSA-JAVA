class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] Dup = new int [image.length][];
        for(int i = 0 ; i < image.length ; i++) {
            Dup[i] = new int [image[i].length];
            int temp = 0;
            for (int j = (image.length-1); j >= 0 ; j--) {
                Dup[i][j] = 0;
                Dup[i][j] = image[i][temp];
                if(Dup[i][j] == 0)
                    Dup[i][j] = 1;
                else
                    Dup[i][j] = 0;
                temp++;
            }
        }
        return Dup;
    }
}