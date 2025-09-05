package Practice;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();

        int max = a;

        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;

        }
        System.out.println("Largest value is "+max);
    }

}
