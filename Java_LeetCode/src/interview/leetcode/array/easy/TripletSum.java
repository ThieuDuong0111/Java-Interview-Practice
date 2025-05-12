package interview.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, return all triplets [a, b, c] such that a + b + c = 0 . The solution must not contain duplicate triplets (e.g., [1, 2, 3] and [2, 3, 1] are considered duplicates). If no such triplets are found, return an empty array.

Each triplet can be arranged in any order, and the output can be returned in any order.

Example:
Input: nums = [0, -1, 2, -3, 1]
Output: [[-3, 1, 2], [-1, 0, 1]]

📈 Độ phức tạp:
Thời gian: O(n^2) (vì vòng for + two pointers)

Không gian: O(1) (nếu không tính kết quả trả về)
*/

public class TripletSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums); // Bước 1: Sắp xếp
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // Bỏ trùng

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					// Bỏ trùng tiếp theo
					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				} else if (sum < 0) {
					left++; // Cần tổng lớn hơn
				} else {
					right--; // Cần tổng nhỏ hơn
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 0, -1, 2, -3, 1 };

		List<List<Integer>> result = threeSum(nums);

		System.out.println("Output: ");
		for (List<Integer> triplet : result) {
			System.out.println(triplet);
		}
	}
}
