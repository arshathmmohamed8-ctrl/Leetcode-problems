class Solution {
    public boolean checkDivisibility(int n) {
    int temp=n;
    int res=0;
    int sum=0;
    int prod=1;
    while(n>0){
         int num=n%10;
         sum+=num;
         prod*=num;
         n/=10;
    }
    int div=sum+prod;
    return temp%div==0;
    }
    
}