class Solution {
    public void sortColors(int[] nums) {int one=0; int two=0;int zero=0;
        for (int j : nums) {
            if (j == 0) {
                zero++;
            } else if (j == 1) {
                one++;
            } else {
                two++;
            }
        }
        int index=0;
        while(zero>0){
            nums[index]=0;
            index++;
            zero--;
        }
        while(one>0){
            nums[index]=1;
            index++;
            one--;
        }
        while (two>0){
            nums[index]=2;
            index++;
            two--;
        }
    }
}