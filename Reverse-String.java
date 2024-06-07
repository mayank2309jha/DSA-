    public static String reverseWords(String s) {
        int len = s.length();
        String curr = "";
        String ans = "";
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                //the word formation has been completed for now.
                if(curr.length() > 0){
                    ans = ans + curr + " ";
                    curr = "";
                }
            }
            else{
                curr = s.charAt(i) + curr;
            }
        }
        ans = ans +curr;
        if(ans.charAt(ans.length()-1) == ' '){
            return ans.substring(0,ans.length()-1);
        }
        return ans;
    }
    public static String reverseWords(String s) {
        int len = s.length();
        String curr = "";
        String ans = "";
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                //the word formation has been completed for now.
                if(curr.length() > 0){
                    ans = ans + curr + " ";
                    curr = "";
                }
            }
            else{
                curr = s.charAt(i) + curr;
            }
        }
        ans = ans +curr;
        if(ans.charAt(ans.length()-1) == ' '){
            return ans.substring(0,ans.length()-1);
        }
        return ans;
    }
