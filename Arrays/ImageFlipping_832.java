package Arrays;

import java.util.Arrays;


public class ImageFlipping_832 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] image = flipAndInvertImage(arr);
//        int [][] invert = InvertImage(image);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
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
