class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int op=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(op>0){
                    ans+=ch;
                }
                op++;
            }
                else{
                    op--;
                    if(op>0) ans+=ch;
                }
            }
            return ans;
        }
    }