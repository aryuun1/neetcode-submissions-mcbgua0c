class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> single = new HashSet<>();

        for(int num: nums){
            if(single.contains(num)){
                single.remove(num);
            }else{
                single.add(num);
            }
        }
        return single.iterator().next();
            }
}
