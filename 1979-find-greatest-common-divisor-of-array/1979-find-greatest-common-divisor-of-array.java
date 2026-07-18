class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int arr:nums){
            min=Math.min(min,arr);
            max=Math.max(max,arr);
        }
        return gcd(min,max);
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}