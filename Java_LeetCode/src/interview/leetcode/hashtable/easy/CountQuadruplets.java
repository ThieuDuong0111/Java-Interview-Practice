package interview.leetcode.hashtable.easy;

/*Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:

nums[a] + nums[b] + nums[c] == nums[d], and
a < b < c < d
 

Example 1:

Input: nums = [1,2,3,6]
Output: 1
Explanation: The only quadruplet that satisfies the requirement is (0, 1, 2, 3) because 1 + 2 + 3 == 6.
Example 2:

Input: nums = [3,3,6,4,5]
Output: 0
Explanation: There are no such quadruplets in [3,3,6,4,5].
Example 3:

Input: nums = [1,1,1,3,5]
Output: 4
Explanation: The 4 quadruplets that satisfy the requirement are:
- (0, 1, 2, 3): 1 + 1 + 1 == 3
- (0, 1, 3, 4): 1 + 1 + 3 == 5
- (0, 2, 3, 4): 1 + 1 + 3 == 5
- (1, 2, 3, 4): 1 + 1 + 3 == 5
 

Constraints:

4 <= nums.length <= 50
1 <= nums[i] <= 100*/

public class CountQuadruplets {
	public static int countQuadruplets(int[] nums) {
		int count = 0;
		int n = nums.length;

		for (int a = 0; a < n - 3; a++) {
			for (int b = a + 1; b < n - 2; b++) {
				for (int c = b + 1; c < n - 1; c++) {
					for (int d = c + 1; d < n; d++) {
						if (nums[a] + nums[b] + nums[c] == nums[d]) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 6 };
		System.out.println("Output: " + countQuadruplets(nums));
	}
}
