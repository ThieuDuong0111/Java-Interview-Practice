package interview.leetcode.tutorial.search;

/*
📊 Độ phức tạp:
Thời gian (Time): O(log n) vì mỗi lần giảm nửa không gian tìm kiếm.

Không gian (Space): O(1) nếu dùng bản lặp (iterative).
*/

public class BinarySearch {

	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 7;
		int result = binarySearch(arr, target);

		if (result != -1) {
			System.out.println("Found " + target + " at index " + result);
		} else {
			System.out.println(target + " not found in array.");
		}
	}
}
