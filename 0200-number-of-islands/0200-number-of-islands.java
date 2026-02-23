class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int row = grid.length;
        int column = grid[0].length;
        int islands = 0;
        for (int i = 0 ; i < row ; i++){
            for (int j = 0; j < column ; j++){
                if (grid[i][j] != '1') continue;
                islands ++;
                dfs(grid, i, j ,directions);
            }
        }
        return islands;
    }
    private void dfs(char[][]grid, int row, int col, int[][] directions){
        if(grid[row][col] == '0') return;
        grid[row][col] = '0';
        for(int[] dir : directions){
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if(newRow >= 0 && newRow < grid.length&& newCol >= 0 && newCol < grid[0].length){
                dfs(grid, newRow, newCol, directions);
            }
        }
    }
}