
public class MaxAreaOfIsland {

	public static void main(String[] args) {
		int[][] grid = {
						{0,0,1,0,0,0,0,1,0,0,0,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,1,1,0,1,0,0,0,0,0,0,0,0},
						{0,1,0,0,1,1,0,0,1,0,1,0,0},
						{0,1,0,0,1,1,0,0,1,1,1,0,0},
						{0,0,0,0,0,0,0,0,0,0,1,0,0},
						{0,0,0,0,0,0,0,1,1,1,0,0,0},
						{0,0,0,0,0,0,0,1,1,0,0,0,0}
						};
		maxAreaOfIsland(grid);

	}
	
	private static void maxAreaOfIsland(int[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;
        int max = 0;
        
        for(int i=0; i<rowCount; i++) {
        	for(int j=0; j< columnCount; j++) {
        		if(grid[i][j] == 1) {
        			int count = 1;
        			count = getMaxAreaIsland(grid, rowCount, columnCount, i, j, count);
        			max = Math.max(max, count);
        		}
        	}
        }
        System.out.println("max - "+ max);
    }

	private static int getMaxAreaIsland(int[][] grid, int rowCount, int columnCount, int row, int column, int count) {
		
		if(row < 0 || column < 0 || row >= rowCount || column >= columnCount)
			return 0;
		if(grid[row][column] == 0)
			return count;
		
		grid[row][column] = 0;
		
		int prev = column-1;
		int up = row-1;
		int next = column+1;
		int down = row+1;
		
		if(prev >= 0 && grid[row][prev] == 1) {
			count++;
			count = getMaxAreaIsland(grid, rowCount, columnCount, row, prev, count);
		}
		if(up >= 0 && grid[up][column] == 1) {
			count++;
			count = getMaxAreaIsland(grid, rowCount, columnCount, up, column, count);
		}
		if(next < columnCount && grid[row][next] == 1) {
			count++;
			count = getMaxAreaIsland(grid, rowCount, columnCount, row, next, count);
		}

		if(down < rowCount && grid[down][column] == 1) {
			count++;
			count = getMaxAreaIsland(grid, rowCount, columnCount, down, column, count);
		}
		
		return count;
		
	}

}
