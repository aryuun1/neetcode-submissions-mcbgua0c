class Solution {
    public int middle(int[] nums, int low, int high, int target ){
        
        if(low>high) return -1;

        int mid = low+(high-low)/2;

        if(nums[mid] == target) return mid;
        return (nums[mid]<target) ? 
            middle(nums, mid+1, high, target) :
            middle(nums, low , mid-1, target);
    }
    public int search(int[] nums, int target) {
        return middle(nums, 0, nums.length-1, target);
        
    }
}
