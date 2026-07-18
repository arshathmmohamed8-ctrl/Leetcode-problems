class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int n=nums.length;
         int [] arr=new int[n];
         int j=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            arr[j]=sum;
            j++;
        }
        return arr;
    }
}