package interview.leetcode.tutorial.sort;

public class SelectionSort {

	public static void slectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			// swap
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 9, 4, 3, 10, 2, 5 };
		slectionSort(arr);
		System.out.println("Output:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
