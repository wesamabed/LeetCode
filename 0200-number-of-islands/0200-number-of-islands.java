class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int max = 0;
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column ; j++){
                if(grid[i][j] != '1') continue;
                Queue<int[]> queue = new ArrayDeque<>();
                queue.offer(new int[]{i, j});
                max += 1;
                grid[i][j] = '0';
                while(!queue.isEmpty()){
                    int levelSize = queue.size();
                    for (int k = 0 ; k < levelSize; k++){
                        int [] current = queue.poll();
                        int curRow = current[0];
                        int curCol = current[1];
                        boolean left = curCol - 1 >= 0;
                        boolean right = curCol + 1 < column;
                        boolean up = curRow - 1 >= 0;
                        boolean down = curRow + 1 < row;
                        if (right && grid[curRow][curCol + 1] == '1'){
                            queue.offer(new int[]{curRow, curCol + 1});
                            grid[curRow][curCol + 1] = '0';
                        }
                        if (left && grid[curRow][curCol - 1] == '1'){
                            queue.offer(new int[]{curRow, curCol - 1});
                            grid[curRow][curCol - 1] = '0';
                        }
                        
                        if (down && grid[curRow + 1][curCol] == '1'){
                            queue.offer(new int[]{curRow + 1,curCol});
                            grid[curRow + 1][curCol] = '0';
                        }
                        if (up && grid[curRow - 1][curCol] == '1'){
                            queue.offer(new int[]{curRow - 1,curCol});
                            grid[curRow - 1][curCol] = '0';
                        }
                    }
                }
            }
        }
        return max;
    }
}