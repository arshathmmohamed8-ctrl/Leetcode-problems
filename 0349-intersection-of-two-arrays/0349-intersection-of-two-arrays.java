class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp=new int[nums1.length];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            boolean found=false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                    break;
                }
            }
            boolean print=false;
            for(int k=0;k<i;k++){
                if(nums1[i]==nums1[k]){
                    print=true;
                    break;
                }
            }
            if(found&&!print){
               temp[count]=nums1[i];
               count++;
            }
        }
        int[] res=new int[count];

        for(int i=0;i<count;i++){
            res[i]=temp[i];
        }
        return res;
    }
}