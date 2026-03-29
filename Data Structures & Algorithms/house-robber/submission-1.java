class Solution {
    public int rob(int[] nums) {
        int robie1 = 0, robie2 = 0;

        for(int num: nums){
            int temp = Math.max(num + robie1,  robie2);
            robie1 = robie2;
            robie2 = temp;
        }
        return robie2;
    }
}
