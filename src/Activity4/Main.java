package Activity4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification notification=new Notification();
		View view=new View(notification);
		notification.setNotificationData("bonjour");
		notification.setNotificationData("bon apres midi");
		notification.setNotificationData("bon nuit");
	}

}
