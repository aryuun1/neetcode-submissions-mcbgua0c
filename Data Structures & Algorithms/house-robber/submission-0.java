class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];


        int[] bottomUp = new int[nums.length];
        bottomUp[0] = nums[0];
        bottomUp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++){
            bottomUp[i] = Math.max(bottomUp[i-1], nums[i]+ bottomUp[i-2]);
        }
        return bottomUp[nums.length - 1];
    }
}