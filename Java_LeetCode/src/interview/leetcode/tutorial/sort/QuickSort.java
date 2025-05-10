package interview.leetcode.tutorial.sort;

/*
Quicksort (sắp xếp nhanh) là một thuật toán chia để trị (divide and conquer). Ý tưởng chính là:

1. Chọn một phần tử gọi là pivot (trục).

2. Phân chia (partition) mảng thành 2 phần:

	. Các phần tử nhỏ hơn hoặc bằng pivot ở bên trái.
	
	. Các phần tử lớn hơn pivot ở bên phải.

3. Đệ quy sắp xếp hai phần còn lại.

4. Không cần mảng phụ (sắp xếp in-place).

🔁 Giải thích step-by-step:

Ví dụ: [10, 7, 8, 9, 1, 5]

1. pivot = 5

2. Partition: Sau khi quét mảng, mảng được chia:

	- Nhỏ hơn 5: [1]
	
	- pivot: 5
	
	- Lớn hơn 5: [10, 7, 8, 9]

3. Gọi lại quickSort() đệ quy trên [1] và [10, 7, 8, 9] (lặp lại tương tự).

📊 Độ phức tạp
Trường hợp		Thời gian
Best case		O(n log n)
Average case	O(n log n)
Worst case		O(n²)
Space			O(log n) (do stack gọi đệ quy)
*/

public class QuickSort {

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			// Tìm điểm giữa
			int mid = (left + right) / 2;

			// Gọi đệ quy sắp xếp nửa trái
			mergeSort(arr, left, mid);
			// Gọi đệ quy sắp xếp nửa phải
			mergeSort(arr, mid + 1, right);

			// Trộn hai mảng con đã sắp xếp
			merge(arr, left, mid, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		// Tạo 2 mảng tạm
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy dữ liệu
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		// Trộn 2 mảng
		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		// Copy phần còn lại
		while (i < n1)
			arr[k++] = L[i++];
		while (j < n2)
			arr[k++] = R[j++];
	}

	public static void main(String[] args) {
		int[] nums = { 38, 27, 43, 3, 9, 82, 10 };
		mergeSort(nums, 0, nums.length - 1);
		System.out.println("Output:");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}
