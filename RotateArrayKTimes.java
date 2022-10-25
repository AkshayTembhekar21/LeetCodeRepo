
public class RotateArrayKTimes {

	public static void main(String[] args) {
		//int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {1,2};
		int k = 5;
		
		if(nums.length == 1 || k==nums.length) {
			return;
		}
		if(k > nums.length) {
			k = k % nums.length;
		}
		rotate(nums, k);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+",");
		}
	}
	
	public static void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
        start = 0;
        end = k-1;
        while(start < end) {
        	int temp = nums[start];
        	nums[start] = nums[end];
        	nums[end] = temp;
        	start++;
        	end--;
        }
        
        start = k;
        end = nums.length-1;
        while(start < end) {
        	int temp = nums[start];
        	nums[start] = nums[end];
        	nums[end] = temp;
        	start++;
        	end--;
        }
    }

}
