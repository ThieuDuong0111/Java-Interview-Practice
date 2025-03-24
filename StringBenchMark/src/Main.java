
public class Main {

	public static void main(String[] args) {
		int iterations = 1_000_000; // Số lần lặp

		// Benchmark với String
		long startTime = System.currentTimeMillis();
		String result = "";
		for (int i = 0; i < iterations; i++) {
			result += "test"; // Mỗi lần nối sẽ tạo một object mới
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken with String: " + (endTime - startTime) + " ms");
		//Output: 230238ms

		// Benchmark với StringBuilder
		startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < iterations; i++) {
			sb.append("test"); // Chỉ mở rộng buffer thay vì tạo object mới
		}
		result = sb.toString();
		endTime = System.currentTimeMillis();
		System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
		//Output: 12ms
	}

}

