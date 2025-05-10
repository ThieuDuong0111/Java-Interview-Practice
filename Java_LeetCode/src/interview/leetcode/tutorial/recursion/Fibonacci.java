package interview.leetcode.tutorial.recursion;

/*Dãy Fibonacci là một dãy số trong đó:

Số đầu tiên là: 0

Số thứ hai là: 1

Mỗi số tiếp theo là tổng của hai số trước đó

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 0)
			return 0; // base case
		if (n == 1)
			return 1; // base case
		return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(6)); // Output: 8
	}
}
