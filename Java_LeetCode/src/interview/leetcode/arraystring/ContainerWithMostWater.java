package interview.leetcode.arraystring;

//Đề bài:
//Bạn được cung cấp một mảng số nguyên height[], trong đó mỗi phần tử biểu diễn chiều cao của một cột trên một biểu đồ. 
//Các cột này được đặt liên tiếp nhau.
//Hãy tìm hai cột tạo thành một container sao cho chứa được lượng nước nhiều nhất.

//Quy tắc:
//Lượng nước chứa được phụ thuộc vào chiều cao của hai cột và khoảng cách giữa chúng.
//Diện tích được tính bằng công thức: Area = min(height[left], height[right]) * (right-left))
//
//Ví dụ:
//
//Input: int[] height = {1,8,6,2,5,4,8,3,7} 
//Output: min(8,7) * (8-1) = 7 * 7 = 49 

public class ContainerWithMostWater {
	public static int maxAreaBruteForce(int[] height) {
		int maxArea = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length; j++) {
				int area = Math.min(height[i], height[j]) * (j - i);
				maxArea = Math.max(maxArea, area);
			}
		}
		return maxArea;
	}

	public static int maxAreaTwoPointer(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		while (left < right) {
			left++;
			int area = Math.min(height[left], height[right]) * (right - left);
			maxArea = Math.max(maxArea, area);

			// Di chuyển con trỏ thấp hơn
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Max Area (Brute Force): " + maxAreaBruteForce(height));
		System.out.println("Max Area (Two Pointer): " + maxAreaTwoPointer(height));
	}
}
