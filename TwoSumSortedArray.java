
public class TwoSumSortedArray {

	public static void main(String[] args) {
		int[] arr = twoSum(new int[]{2,7,11,15}, 9);
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);

	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};
    }

}
