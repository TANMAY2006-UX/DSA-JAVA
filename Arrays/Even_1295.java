package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Even_1295 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers in an Array : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int result = CheckEven(arr , n);
        System.out.println("Even Numbers are: " + result);
        
    }

    static int CheckEven(int[] arr , int n)
    {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0)
            {
                arr[i] *= -1;
            }
            int count = 0;
            int temp = arr[i];
            while(temp != 0 ){
                temp /= 10;
                count++;
            }

            if(count % 2 == 0)
            {
                result ++;
            }
        }
        return result;
    }
}
