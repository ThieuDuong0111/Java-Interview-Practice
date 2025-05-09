package interview.leetcode.tutorial.search;

/*Linear Search (Tìm kiếm tuyến tính)
Duyệt từng phần tử trong mảng.

Đơn giản nhưng chậm (O(n)).

📊 Độ phức tạp:
- Thời gian (Time):

- Trường hợp xấu nhất: O(n) (phải duyệt hết mảng).

- Không gian (Space):

O(1) (không dùng thêm bộ nhớ ngoài mảng đầu vào).
*/

public class LinearSearch {

	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i; // Trả về chỉ số khi tìm thấy
			}
		}
		return -1; // Không tìm thấy
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 1, 9 };
		int target = 7;
		int result = linearSearch(arr, target);

		if (result != -1) {
			System.out.println("Found " + target + " at index " + result);
		} else {
			System.out.println(target + " not found in array.");
		}
	}
}
