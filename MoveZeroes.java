
public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {2,1};
		moveZeroes(nums);
		for(int i=0; i< nums.length; i++) {
			System.out.print(nums[i]+",");
		}

	}
	
	public static void moveZeroes(int[] nums) {
        //set firstZero var to the 1st 0th element
        //set firstNonZero var to the next element
        int firstZerothElement = 0;
        int currentNonZerothElement = 0;
        boolean isZeroPresent = false;
        
        if (nums == null || nums.length <= 1) return;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                firstZerothElement = i;
                currentNonZerothElement = i+1;
                isZeroPresent = true;
                break;
            }
        }
        if(isZeroPresent){
	        while(currentNonZerothElement < nums.length){
	            if(nums[firstZerothElement] == 0 && nums[currentNonZerothElement] != 0){
	                nums[firstZerothElement] = nums[currentNonZerothElement];
	                nums[currentNonZerothElement] = 0;
	                
	                firstZerothElement++;
	                currentNonZerothElement++;
	            }else if(nums[firstZerothElement] != 0){
	            	firstZerothElement++;
	            }else if(nums[currentNonZerothElement] == 0){
	            	currentNonZerothElement++;
	            }
	        }
        }
    }

}
