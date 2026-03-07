class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int n = asteroids.length;
        for(int i = 0 ; i < n ; i++){
            if(asteroids[i] > 0){
                    s.push(asteroids[i]);
            }
            else{
                if(!s.isEmpty() && s.peek() > 0){
                        while (!s.isEmpty() && s.peek() < (-1 * asteroids[i]) && s.peek() > 0) {
                            s.pop();
                        }
                        if (!s.isEmpty() && s.peek() == (-1 * asteroids[i]) && s.peek() > 0) {
                            s.pop();
                        }
                        else if(!s.isEmpty() && s.peek() < 0){
                            s.push(asteroids[i]);
                        }
                        else if(s.isEmpty()){
                            s.push(asteroids[i]);
                        }
                    }
                else{
                    s.push(asteroids[i]);
                }
            }
        }

        int size = s.size();
        int[] arr = new int[size];
        for(int i = size - 1 ; i >= 0 ; i--){
            arr[i] = s.peek();
            s.pop();
        }
        return arr;
    }
}