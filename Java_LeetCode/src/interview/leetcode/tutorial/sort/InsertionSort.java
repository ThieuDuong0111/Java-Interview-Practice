package interview.leetcode.tutorial.sort;

/*Time Complexity (Độ phức tạp thời gian)
Trường hợp		Độ phức tạp
Best case		O(n)
Average case	O(n²)
Worst case		O(n²)
*/

//Sắp xếp [5, 2, 4, 6, 1]
//
//Bước 1: [2, 5, 4, 6, 1]
//
//Bước 2: [2, 4, 5, 6, 1]
//
//Bước 3: [2, 4, 5, 6, 1]
//
//Bước 4: [1, 2, 4, 5, 6]

public class InsertionSort {

	public static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int key = nums[i]; // phần tử đang xét
			int j = i - 1;

			// Dịch chuyển các phần tử lớn hơn key sang phải
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j--;
			}

			// Chèn key vào đúng vị trí
			nums[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 6, 9, 4, 3, 10, 2, 5 };
		insertionSort(nums);
		System.out.println("Output:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
