package interview.leetcode.tutorial.sort;

/*
Bước 1: Tìm phần tử nhỏ nhất từ 0 → 4: là 11 → đổi chỗ với 64
→ [11, 25, 12, 22, 64]

Bước 2: Tìm nhỏ nhất từ 1 → 4: là 12 → đổi chỗ với 25
→ [11, 12, 25, 22, 64]

Bước 3: Tìm nhỏ nhất từ 2 → 4: là 22 → đổi với 25
→ [11, 12, 22, 25, 64]

Bước 4: Tìm nhỏ nhất từ 3 → 4: là 25 → không đổi
→ [11, 12, 22, 25, 64]

Độ phức tạp:
Trường hợp			Thời gian
Best case			O(n²)
Average case		O(n²)
Worst case			O(n²)
Space complexity	O(1) – không dùng mảng phụ
Ổn định?			❌ Không ổn định (có thể đổi chỗ phần tử bằng nhau)
*/

public class SelectionSort {

	public static void selectionSort(int[] nums) {
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
		int[] nums = { 6, 9, 4, 3, 10, 2, 5 };
		selectionSort(nums);
		System.out.println("Output:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
