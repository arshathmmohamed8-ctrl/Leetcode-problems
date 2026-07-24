class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] array1=new int[friends.length];
        int k=0;
        for(int arr:order){
            for(int bro:friends){
                if(arr==bro){
                    array1[k]=arr;
                    k++;
                }
            }
        }
        return array1;
        
    }
}