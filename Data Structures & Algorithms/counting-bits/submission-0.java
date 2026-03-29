class Solution {
    public int[] countBits(int n) {
        int res = 0;
        int arr[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            res = Integer.bitCount(i);
            arr[i] = res;
        }
        return arr;
    }
}
