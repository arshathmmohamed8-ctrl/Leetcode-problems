class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0,j=0,k=1;
        int[] temp=new int[nums.length];

        while(i<nums.length){
            if(nums[i]%2==0){
                temp[j]=nums[i];
                j+=2;
            }
            else{
                temp[k]=nums[i];
                k+=2;
            }
            i++;
        }
        return temp;
    }
}