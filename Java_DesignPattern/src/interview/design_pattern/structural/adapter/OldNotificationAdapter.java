package interview.design_pattern.structural.adapter;

public class OldNotificationAdapter implements NotificationSender {
	private OldNotificationService oldService;

	public OldNotificationAdapter(OldNotificationService oldService) {
		this.oldService = oldService;
	}

	@Override
	public void send(String message) {
		// Chuyển đổi lời gọi phương thức từ interface chuẩn sang hệ thống cũ
		oldService.sendOldNotification(message);
	}
}
