class Solution {
    public int reverseDegree(String s) {
        // declaring res to sum the value
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=('z'-s.charAt(i)+1) * (i+1);
        }
        return res;

    }
}