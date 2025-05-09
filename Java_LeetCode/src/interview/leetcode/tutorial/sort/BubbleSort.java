package interview.leetcode.tutorial.sort;

public class BubbleSort {

	public static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			boolean isSwapped = false;
			// Mỗi vòng lặp đẩy phần tử lớn nhất về cuối
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					// Hoán đổi
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 9, 4, 3, 10, 2, 5 };
		bubbleSort(arr);
		System.out.println("Output:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
