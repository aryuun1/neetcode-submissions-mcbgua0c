class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone:stones){
            pq.add(stone);
        }
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.peek();

            if(x == y){
                pq.poll();
            }
            else if(x>y){
                pq.poll();
                int z = x-y;
                pq.add(z);
            }
            else{
                pq.poll();
                int z = y-x;
                pq.add(z);
            }
        }
        if(pq.size() == 0){
            return 0;
        }
        return pq.peek();
    }
}
