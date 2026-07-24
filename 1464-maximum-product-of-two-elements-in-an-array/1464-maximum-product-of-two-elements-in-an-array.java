class Solution {
    public int maxProduct(int[] nums) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int arr:nums){
            if(arr>=min){
                max=min;
                min=arr;
            }
            else if(arr>max){
                max=arr;
            }
        }
        return (min-1)*(max-1);
    }

}