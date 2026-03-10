class Solution {
    public static String simplifyPath(String path) {
        String rev = "";
        Stack<String> s = new Stack<>();

            String[] arr =  path.split("/");
            for(int i = 0; i < arr.length; i++){
                if(!arr[i].isEmpty() && !arr[i].equals(".")) {
                    if(!s.isEmpty() &&  arr[i].equals("..")) {
                        s.pop();
                    }
                    else if(s.isEmpty() &&  arr[i].equals("..")) {
                        continue;
                    }
                    else
                        s.push(arr[i]);
                }
            }

        String ans = "";
        while(!s.isEmpty()){
                ans = "/" + s.peek() + ans;
                s.pop();
            }
        if(ans == ""){
            return "/";
        }
        return ans;
    }
}