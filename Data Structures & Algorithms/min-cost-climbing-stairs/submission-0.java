class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] costTab = new int[n + 1];

        for(int i = 2; i <= n; i++){
            costTab[i] = Math.min(costTab[i-1] + cost[i-1], costTab[i-2]+cost[i-2]);
        }
        return costTab[n];
    }
}
