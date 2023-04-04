package Activity4;

public class NotificationData {
	private String notification;
	private int numberNotification;
	public NotificationData(String notification, int numberNotification) {
		super();
		this.notification = notification;
		this.numberNotification = numberNotification;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public int getNumberNotification() {
		return numberNotification;
	}
	public void setNumberNotification(int numberNotification) {
		this.numberNotification = numberNotification;
	}
}
