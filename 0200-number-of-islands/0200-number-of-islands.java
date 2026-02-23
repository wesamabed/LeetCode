class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int row = grid.length;
        int column = grid[0].length;
        int islands = 0;
        for (int i = 0 ; i < row ; i++){
            for (int j = 0; j < column ; j++){
                if(grid[i][j] != '1') continue;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.offer(new int[]{i, j});
                grid[i][j] = '0';
                islands ++;
                while(!queue.isEmpty()){
                    int [] curr = queue.poll();
                    for (int[] dir : directions){
                        int newRow = curr[0] + dir[0];
                        int newCol = curr[1] + dir[1];
                        if(newRow >= 0 && newRow < row && newCol >= 0 && newCol < column && grid[newRow][newCol] == '1'){
                            queue.offer(new int[]{newRow, newCol});
                            grid[newRow][newCol] = '0';
                        }
                    }

                }
            }
        }
        return islands;
    }
}