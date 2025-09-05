package Arrays;

public class Even_LeetCode {

        public static void main(String[] args) {

           int[] arr = {555,901,482,1771};

           int result = findNumbers(arr);
           System.out.println("Even Numbers are: " + result);

        }

        static int findNumbers(int[] nums)
        {
            int result = 0;
            int i = 0;
            while(i < nums.length){
                if(nums[i] < 0)
                    nums[i] *= -1;
                int count = 0;
                int temp = nums[i];
                while(temp != 0 ){
                    temp /= 10;
                    count++;
                }

                if(count % 2 == 0)
                    result ++;
                i++;
            }
            return result;
        }
    }

