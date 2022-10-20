public class LongestIncreasingPathInMatrix {
	public static void main(String[] args) {
		int[][] arr = {{9,9,4},{6,6,8},{2,1,1}};
		int rowLength = 3;
		int colLength = 3;
		int max = 0;
		int[][] memoizationMatrix = new int[3][3];
		
		
		for(int i=0; i< rowLength; i++) {
			for(int j=0; j< colLength; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		for(int i=0; i< rowLength; i++) {
			for(int j=0; j< colLength; j++) {
				
				max = Math.max(max,findNeighbours(arr,i, j, rowLength, colLength, memoizationMatrix));
			}
		}
		
		System.out.println("max - "+ max);

	}
	
	/*
	 * 9  9  4
	 * 6  6  8
	 * 2  1  1
	 */
	
	private static int findNeighbours(int[][] arr, int row, int col, int rowLength, int colLength, int[][] memoizationMatrix) {
		int prev = col-1;
		int next = col+1;
		int up = row-1;
		int down = row+1;
		int currentMax = 1;
		
		if(row < 0 || col < 0 || row >= rowLength || col >= colLength)
			return 0;
		
		if(memoizationMatrix[row][col] > 0)
			return memoizationMatrix[row][col];
		
		//previous element
		if(prev >= 0 && arr[row][prev] > arr[row][col]) {
			currentMax = Math.max(currentMax, 1+findNeighbours(arr,row, prev, rowLength, rowLength, memoizationMatrix));
		}
		//next element
		if(next <= colLength-1 && arr[row][next] > arr[row][col]) {
			currentMax = Math.max(currentMax, 1+findNeighbours(arr,row, next, rowLength, rowLength, memoizationMatrix));
		}
		//up element
		if(up >= 0 && arr[up][col] > arr[row][col]) {
			currentMax = Math.max(currentMax, 1+findNeighbours(arr,up, col, rowLength, rowLength, memoizationMatrix));
		}
		//down element
		if(down <= rowLength-1 && arr[down][col] > arr[row][col]) {
			currentMax = Math.max(currentMax, 1+findNeighbours(arr,down, col, rowLength, rowLength, memoizationMatrix));
		}
		memoizationMatrix[row][col] = currentMax;
		return currentMax;
		
		/*List<Integer> neighbours = new ArrayList<Integer>();
		int prev = col-1;
		int next = col+1;
		int up = row-1;
		int down = row+1;
		System.out.println("Neighbours of arr["+row+"]"+"["+col+"] - "+arr[row][col]+" are - ");
		if(prev >= 0) {
			System.out.println("prev - "+arr[row][prev]);
		}
		if(next <= colLength-1) {
			System.out.println("next - "+arr[row][next]);
		}
		if(up >= 0) {
			System.out.println("up - "+arr[up][col]);
		}
		if(down <= rowLength-1) {
			System.out.println("down - "+arr[down][col]);
		}*/
	}

}
