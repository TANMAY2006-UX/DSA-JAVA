package Arrays;

import java.util.ArrayList;

public class ArrayListInteger_986 {
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<num.length; i++){
            sum = num[i] + sum * 10;
        }
        sum += k;
        int l = 0;
        int temp = sum;
        while(temp!=0){
            l++;
            temp /= 10;
        }
        if(l == num.length){
            int n = num.length - 1;
            while(n >= 0 && num.length > 1) {
                num[n] = sum % 10;
                sum /= 10;
                n--;
            }
            for (int i = 0; i < num.length; i++) {
                list.add(num[i]);
            }
        }
        else {
            int[] arr = new int[num.length + 1];
            int n = arr.length - 1;
            while(n >= 0 && arr.length > 1) {
                arr[n] = sum % 10;
                sum /= 10;
                n--;
            }
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5};
        int k = 806;
        System.out.println((addToArrayForm(arr, k)));
    }
}
