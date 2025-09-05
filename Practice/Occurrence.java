package Practice;
// n = 1385757879    7 = 3 Times Repeated
import java.util.Scanner;
public class Occurrence {

    int Countlen(int a){

        int temp = a;
        int count = 0;

        while(temp != 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    int Repeat(int a , int b , int c){


        int flag = 0;
        while(a != 0) {
            int temp = a;
            temp = temp % 10;

            if (temp == c) {
                flag++;
            }
            a = a / 10;
        }
        return flag;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Occurrence ob = new Occurrence();
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Enter the number to find ");
        int n1 = sc.nextInt();

        int len = ob.Countlen(n);
        System.out.println("Length is: " +len);
        int repeatation = ob.Repeat(n,len,n1);
        System.out.println("The occurrence of number " + n + " is " + repeatation + " times");

    }

}
