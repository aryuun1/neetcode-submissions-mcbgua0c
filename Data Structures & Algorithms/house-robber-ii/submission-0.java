class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],
               Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)),
                        helper(Arrays.copyOfRange(nums,0, nums.length-1))));
    }

    private int helper(int[] nums){
        int robbery1 = 0, robbery2 = 0;

        for(int num: nums){
            int newRobbery = Math.max(robbery1 + num , robbery2);
            robbery1 = robbery2;
            robbery2 = newRobbery;
        }
        return robbery2;
    }
}
