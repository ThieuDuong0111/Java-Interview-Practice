package interview.java_core.static_practice;

/*🧠 Giải thích chi tiết
1. static class Inner là gì?

Đây là static nested class — tức là class nằm trong class khác và được khai báo là static.

Điều này khác với inner class thông thường (không có từ khóa static).

2. Đặc điểm của static nested class:

Đặc điểm														Giải thích

Không thể truy cập trực tiếp các biến non-static của Outer		Vì nó không gắn với object Outer

Có thể truy cập các biến/method static của Outer				Vì static → gắn với class, không cần object

Có thể tạo object của nó mà không cần tạo object Outer			Outer.Inner inner = new Outer.Inner();

🔍 So sánh static nested class vs inner class thường

Tiêu chí									static nested class		inner class (non-static)

Có thể truy cập biến instance của Outer?	❌ Không					✅ Có

Cần object Outer để khởi tạo?				❌ Không					✅ Có

Tạo object thế nào?							new Outer.Inner()		new Outer().new Inner()

💡 Khi nào dùng static nested class?

  Nên dùng khi:

Trường hợp																			Mô tả
✅ 1. Khi class con không cần truy cập dữ liệu instance (non-static) của class cha	static nested class chỉ truy cập được static members của outer class
✅ 2. Khi bạn muốn tổ chức logic liên quan, nhưng độc lập về mặt instance			Gắn kết logic với outer class mà không cần tạo đối tượng
✅ 3. Để tiết kiệm bộ nhớ (không gắn với instance của outer class)					JVM không cần giữ tham chiếu tới outer instance
✅ 4. Khi muốn tạo tiện ích/helper class riêng biệt bên trong class chính			Ví dụ như Builder, Comparator, Entry, v.v.

🔁 Tóm tắt
Dùng static nested class khi:

- Không cần truy cập biến instance từ outer class.
- Muốn giảm sự phụ thuộc và tối ưu bộ nhớ.
- Dùng trong pattern như Builder, Utility, Group constants, v.v.
*/

public class Outer {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("Data từ Outer: " + data);
		}
	}

	public static void main(String args[]) {
		Outer.Inner obj = new Outer.Inner();
		obj.msg();
	}
}
