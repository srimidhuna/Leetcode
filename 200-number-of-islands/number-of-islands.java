class Solution {
    public void bfs(char[][] grid, int r, int c, int[][] dirs) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {r, c});
        grid[r][c] = '0';
        
        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i=0; i<size; i++) {
                int[] curr = queue.remove();
                int cR = curr[0];
                int cC = curr[1];

                for(int[] dir : dirs) {
                    int nR = cR + dir[0];
                    int nC = cC + dir[1];

                    if(nR >= grid.length || nC >= grid[0].length || nR < 0 || nC < 0 || grid[nR][nC] == '0') {
                        continue;
                    }

                    grid[nR][nC] = '0';
                    
                    queue.add(new int[] {nR, nC});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;

        int[][] dirs = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j, dirs);
                }
            }
        }
        return count;
    }
}