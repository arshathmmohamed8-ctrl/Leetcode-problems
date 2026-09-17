class Solution {
    public int maximumCount(int[] nums) {
        int count_POS=0;
        int count_NEG=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count_POS++;
            }
            else if(nums[i]<0){
                count_NEG++;
            }
        }
        return Math.max(count_POS,count_NEG);
    }
}