package Activity4;

import java.util.Observable;

public class Notification extends Observable {
	private String notification;
	private int numberNotification;
	
	public Notification(String notification, int numberNotification) {
		
		this.notification = notification;
		this.numberNotification = numberNotification;
	}

	
	public Notification() {
		notification="";
		numberNotification=0;
	}


	public void setNotificationData(String not) {
		this.notification=not;
		this.numberNotification+=1;
		setChanged();
		notifyObservers(new NotificationData(this.notification,this.numberNotification));
		
	}

}
