package interview.leetcode.tutorial.sort;

/*Độ phức tạp
Trường hợp		Độ phức tạp
Tốt nhất		O(n)
Trung bình		O(n²)
Xấu nhất		O(n²)
Không gian phụ	O(1)*/

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
		int[] nums = { 6, 9, 4, 3, 10, 2, 5 };
		bubbleSort(nums);
		System.out.println("Output:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
