class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int high=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>high){
                high=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=high){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return  list;
    }
}