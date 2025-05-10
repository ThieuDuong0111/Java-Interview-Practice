package interview.java_core.static_practice;

/*
Giải thích chi tiết
Biến count là static, nên chỉ có 1 bản sao duy nhất trong bộ nhớ, dù bạn tạo bao nhiêu object Counter.

Khi constructor chạy (new Counter()), count++ được thực hiện — và nó luôn tăng trên cùng một biến static.

Vì vậy:

c1 tạo ra: count = 1

c2 tạo ra: count = 2

c3 tạo ra: count = 3

Lưu ý quan trọng
		Điều cần lưu ý											Giải thích
		
Static không thể dùng this.count					Vì count là của class, không phải object

Static biến thay đổi ảnh hưởng đến tất cả object	Đây là điểm thường bị nhầm nếu bạn quen với instance variable

Static variable không reset khi bạn tạo object mới	Nó "sống" đến khi class được unload hoặc JVM kết thúc

✅ Khi nào nên dùng static variable
Trường hợp sử dụng								Mô tả
1. Dữ liệu dùng chung giữa tất cả các object	Ví dụ: tên công ty, thuế suất, tỉ giá, cấu hình hệ thống
2. Đếm số object được tạo						Dùng static để tăng biến mỗi khi constructor được gọi
3. Lưu cache, config, hoặc constant				Dùng static cho các dữ liệu đọc nhiều, ít thay đổi (VD: final static int MAX_USERS = 1000;)
4. Tạo shared resource							Ví dụ: connection pool, logger (VD: static Logger logger)
5. Dễ dàng truy cập mà không cần tạo object		VD: Math.PI, System.out, Collections.EMPTY_LIST
*/

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
        System.out.println("Đã tạo object thứ: " + count);
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}

