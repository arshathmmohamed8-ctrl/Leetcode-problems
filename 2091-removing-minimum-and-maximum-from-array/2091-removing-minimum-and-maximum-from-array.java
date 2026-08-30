class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max1 = -1;
        int min = Integer.MAX_VALUE;
        int min1 = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
                max1 = i;
            }
            if (min > nums[i]) {
                min = nums[i];
                min1 = i;
            }
        }
        int left = Math.min(max1, min1);
        int right = Math.max(max1, min1);

        int option1 = right + 1; // both from front
        int option2 = n - left; // both from back
        int option3 = left + 1 + n - right; // one front, one back

        return Math.min(option1, Math.min(option2, option3));
    }
}