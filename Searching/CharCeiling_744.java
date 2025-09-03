package Searching;

public class CharCeiling_744 {
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length ;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;

            // if(target > letters[letters.length-1])
            //     return letters[0];
            if (letters[mid] <= target) {
                if(mid != letters.length-1)
                    start = mid + 1;
                else
                    return letters[0];
            }
            else if (letters[mid] > target) {
                end = mid - 1;
            }
            else
                break;
        }
        return letters[start];
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println("Ceiling Number is: "+ nextGreatestLetter(letters,target));
    }

}

