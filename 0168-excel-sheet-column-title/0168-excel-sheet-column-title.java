class Solution {
    public String convertToTitle(int columnNumber) {
        String rev="";

        while(columnNumber>0){
            columnNumber--;
            char ch=(char)('A'+(columnNumber%26));
            rev=ch+rev;
            columnNumber=columnNumber/26;
        }
        return rev;
    }
}