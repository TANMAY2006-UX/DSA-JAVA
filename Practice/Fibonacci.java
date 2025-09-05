package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Size of Series ");
        int n =sc.nextInt();

        int a = 0;
        int b = 1;
        int Sum;
        System.out.print("Series is " + a + " " + b + " ");
        for(int i = 0;i<(n-2) ; i++)
        {
            Sum = a+b;
            System.out.print(Sum + " ");
            a = b;
            b = Sum;
        }

    }
}

