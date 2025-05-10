package interview.java_core.static_practice;

/*
  									LƯU Ý QUAN TRỌNG
			Lưu ý											Giải thích
			
static block chạy 1 lần duy nhất				Khi class được load (kể cả không gọi main)

Dùng để khởi tạo biến static phức tạp			Ví dụ đọc từ file, tạo danh sách mặc định, kết nối DB

static block không thể truy cập biến non-static	Vì nó chạy trước khi object được tạo

									ỨNG DỤNG THỰC TẾ
									
Bạn sẽ gặp static block trong các class như:

JDBC connection setup

Logging framework (Log4j, SLF4J)

Loading các constant cấu hình
*/

public class Config {
	static String appName;

	static {
		appName = "MyApp";
		System.out.println("Static block chạy trước main()");
	}

	public static void main(String[] args) {
		System.out.println("App name là: " + appName);
	}
}
