
public class FindTargetFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 2;
		int low = 0;
		int high = nums.length - 1;

		if (nums.length < 1)
			System.out.println("Array is empty");

		int targetElementIndex = isTargetExist(nums, low, high, target);
		System.out.println("targetElementIndex - "+ targetElementIndex);
	}

	public static int isTargetExist(int[] nums, int low, int high, int target) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (nums[mid] == target)
			return mid;

		if(nums[mid] < target)
			return isTargetExist(nums, mid+1, high, target);
		else
			return isTargetExist(nums, low, mid-1, target);
	}

}
