class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],
             Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)),
             helper(Arrays.copyOfRange(nums, 0, nums.length-1))));
    }

    private int helper(int[] nums){
        int robber1 = 0, robber2 = 0;

        for(int num : nums){
            int newRob = Math.max(robber1+num, robber2);
            robber1 = robber2;
            robber2 = newRob;
        }
        return robber2;
    }
}
