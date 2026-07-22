class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=nums.length;
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            if(i%2==0){
                arr[i]=nums[i/2];
            }
            else{
                arr[i]=nums[n+(i/2)];
            }
        }
        return arr;   
    }
}