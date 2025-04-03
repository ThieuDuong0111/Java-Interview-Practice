package interview.design_pattern.singleton;

public class Singleton {
	private static Singleton instance;
	
	public static Singleton getInstace() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

//📌 Ưu điểm: Chỉ khởi tạo instance khi cần.
//📌 Nhược điểm: Không thread-safe (Nếu nhiều thread truy cập getInstance() cùng lúc, có thể tạo ra nhiều instance).
