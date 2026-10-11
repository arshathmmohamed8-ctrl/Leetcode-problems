class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] temp=new int[nums.length];
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=n-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    count++;
                }
                else if(nums[i]==0){
                    continue;
                }
            }
            temp[k]=count;
            k++;
            count=0;
        }
        return temp;
    }
}