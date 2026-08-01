class Solution {
    public int[] leftRightDifference(int[] nums) {
        int Rightsum=0;
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            Rightsum+=num;
        }
        int Leftsum=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            Rightsum-=nums[i];

            ans[i]=Math.abs(Leftsum-Rightsum);
            Leftsum+=nums[i];
        }
        return ans;
        
    }
}