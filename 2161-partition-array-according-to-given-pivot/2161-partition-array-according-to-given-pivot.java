class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] arr=new int[n];
        int temp=0;
        for(int num:nums){
            if(num<pivot){
                arr[temp]=num;
                temp++;
            }
        }
           for(int num:nums){
            if(num==pivot){
                arr[temp]=num;
                temp++;
            }
        }
        for(int num:nums){
            if(num>pivot){
                arr[temp]=num;
                temp++;
            }
        }
        return arr;
    }
}