class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(i<nums.length){
            sum=sum+nums[i];
            while(sum>=target){
                ans=Math.min(ans,i-j+1);
                sum-=nums[j];
                j++;
            }
            i++;
        }
        return ans == Integer.MAX_VALUE ? 0: ans;
    }
}