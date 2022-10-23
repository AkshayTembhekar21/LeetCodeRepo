public class SquaredSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		nums = sortedSquares(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		

	}
	
	public static int[] sortedSquares(int[] nums) {
        int[] squaredNums = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int squaredPtr = right;
        
        while( left <= right){
            //whichever is greater add it in the last
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                squaredNums[squaredPtr] = nums[left] * nums[left];
                squaredPtr--;
                left++;
            }else{
                squaredNums[squaredPtr] = nums[right] * nums[right];
                squaredPtr--;
                right--;
            }
        }
        return squaredNums;
    }

}
