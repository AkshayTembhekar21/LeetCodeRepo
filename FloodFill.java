
public class FloodFill {

	public static void main(String[] args) {
		int[][] image = {
	            {1,1,1},
	            {1,1,0},
	            {1,0,1}
	    };
		int sr = 1, sc = 1, color = 2;
		int originalColor = image[sr][sc];
		floodFill(image, sr, sc, color, originalColor);
		
		for(int i=0; i<image.length; i++) {
			for(int j=0; j<image[0].length; j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void floodFill(int[][] image, int sr, int sc, int color, int originalColor) {
		
		if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] == color) {
			return;
		}
		
		int left = sc - 1;
		int up = sr - 1;
		int right = sc + 1;
		int down = sr + 1;
		
		image[sr][sc] = color;

		//left
		if(left >= 0 && image[sr][left] == originalColor) {
			floodFill(image, sr, left, color, originalColor);
		}
		//up
		if(up >= 0 && image[up][sc] == originalColor) {
			floodFill(image, up, sc, color, originalColor);
		}
		//right
		if(right <= (image[0].length-1) && image[sr][right] == originalColor) {
			floodFill(image, sr, right, color, originalColor);
		}
		//down
		if(down <= (image.length-1) && image[down][sc] == originalColor) {
			floodFill(image, down, sc, color, originalColor);
		}	
    }

}
