class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int l = 0;
        int r = n-1;

        while(l<r){
            int cur = numbers[l] + numbers[r];

            if(cur<target){
                l++;
            }
            else if(cur>target){
                r--;
            }
            else{return new int[]{l+1, r+1};}
        }
        return new int[]{-1};
    }
}
