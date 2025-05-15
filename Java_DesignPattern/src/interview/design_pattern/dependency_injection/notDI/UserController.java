package interview.design_pattern.dependency_injection.notDI;

public class UserController {

	private EmailService emailService = new EmailService();

	public void send() {
		emailService.sendEmail("Hello Dependency injection pattern");
	}
}

/*
 * Chương trình trên rất đơn giản, chỉ gồm có 2 class. Tuy nhiên, nó có một vài
 * giới hạn như sau:
 * 
 * Lớp UserController phụ thuộc trực tiếp vào class EmailService. Mỗi khi có
 * thay đổi trong lớp EmailService, chẳng hạn thêm tham số cho constructor của
 * class này lên sẽ ảnh hưởng trực tiếp đến class UserController. Một User khác
 * không muốn sử dụng cách gửi message thông qua email, chẳng hạn qua sms,
 * facebook, … Khó khăn khi viết Unit Test cho UserController do phụ thuộc trực
 * tiếp vào EmailService.
 */