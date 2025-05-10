package interview.leetcode.tutorial.sort;

/*✅ Ý tưởng chính của Merge Sort:
Chia (Divide): Chia mảng thành 2 nửa bằng nhau cho đến khi còn 1 phần tử.

Trị (Conquer): Sắp xếp từng nửa (vì mảng 1 phần tử thì đã sắp xếp sẵn).

Trộn (Merge): Gộp hai mảng con đã sắp xếp lại thành mảng lớn hơn cũng đã sắp xếp.

🔁 Ví dụ:
Giả sử mảng:

[38, 27, 43, 3, 9, 82, 10]

Quá trình chia:

[38, 27, 43, 3, 9, 82, 10]
→ [38, 27, 43, 3] + [9, 82, 10]
→ [38, 27] + [43, 3] + [9, 82] + [10]
→ [38] + [27] + [43] + [3] + [9] + [82] + [10]
Quá trình trộn (sắp xếp khi trộn):

[38] + [27] → [27, 38]
[43] + [3] → [3, 43]
[9] + [82] → [9, 82]
→ [27, 38] + [3, 43] → [3, 27, 38, 43]
→ [9, 82] + [10] → [9, 10, 82]
→ [3, 27, 38, 43] + [9, 10, 82] → [3, 9, 10, 27, 38, 43, 82]*/

/*⏱ Độ phức tạp:
Trường hợp			Thời gian
Best case			O(n log n)
Average case		O(n log n)
Worst case			O(n log n)
Space complexity	O(n) – dùng mảng phụ
Ổn định?			✅ Có (không đổi chỗ phần tử bằng nhau)
*/

public class MergeSort {

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
