package interview.leetcode.arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Bài toán: Longest Substring Without Repeating Characters
//Mô tả:
//Cho một chuỗi s, bạn cần tìm độ dài của chuỗi con dài nhất mà không chứa ký tự lặp lại.
//
//Ví dụ:
//Input: "abcabcbb" Output: 3
//Giải thích: Chuỗi con dài nhất không chứa ký tự lặp lại là "abc", với độ dài là 3.
//
//Input: "bbbbb" Output: 1
//Giải thích: Chuỗi con dài nhất không chứa ký tự lặp lại là "b", với độ dài là 1.
//
//Input: "pwwkew" Output: 3
//Giải thích: Chuỗi con dài nhất không chứa ký tự lặp lại là "wke", với độ dài là 3.
//
//Yêu cầu:
//Viết một hàm có độ phức tạp thời gian O(N) để giải quyết bài toán này.

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstringBruteForce(String s) {
		int n = s.length();
		int maxLength = 0;

		// Duyệt qua tất cả các chuỗi con
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substring = s.substring(i, j);
				// Kiểm tra nếu chuỗi con có ký tự lặp lại
				if (hasUniqueCharacters(substring)) {
					maxLength = Math.max(maxLength, substring.length());
				}
			}
		}
		return maxLength;
	}

	// Hàm kiểm tra nếu chuỗi con có ký tự lặp lại
	private static boolean hasUniqueCharacters(String s) {
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
//			System.out.println("Character: " + c);
			if (!set.add(c)) {
				return false; // Có ký tự lặp lại
			}
		}
		return true; // Không có ký tự lặp lại
	}
	
	public static int lengthOfLongestSubstring(String s) {
		//Lưu ký tự và vị trí cuối cùng của chúng trong chuỗi
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        // Duyệt qua chuỗi
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            System.out.println("curretn char: " + currentChar);
            System.out.println("map get curretn char: " + map.get(currentChar));
            // Nếu ký tự đã xuất hiện trước đó và nằm trong cửa sổ hiện tại
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1; // Cập nhật vị trí start của cửa sổ
            }
            System.out.println("curretn start: " + start);
            System.out.println("curretn end: " + end);
            map.put(currentChar, end); // Cập nhật vị trí cuối của ký tự hiện tại
            System.out.println("curretn map: " + map);
            maxLength = Math.max(maxLength, end - start + 1); // Cập nhật độ dài chuỗi con dài nhất
            System.out.println("curretn maxlength: " + maxLength);
            System.out.println("-------------------------------");
        }

        return maxLength;
    }

	public static void main(String[] args) {
		String s = "abcdebcbbacabcdefg";
		System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
	}

}
