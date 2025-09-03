package Practice;

import java.util.Scanner;

public class Upper_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character to search ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lower Case");
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Upper Case");
        }
        else
            System.out.println("Invalid Character");
    }
}
