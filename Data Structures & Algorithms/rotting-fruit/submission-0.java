class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int fresh = 0;
        int rows = grid.length, cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                else if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        while(fresh > 0 && !q.isEmpty()){
            int length = q.size();
            for(int i = 0; i<length; i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir: directions){
                    int row = r+dir[0];
                    int col = c+dir[1];

                    if(row>=0 && row<rows && col >=0 && col<cols && grid[row][col] ==1){
                        grid[row][col] = 2;
                        q.offer(new int[]{row, col});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time:-1;
    }
}

