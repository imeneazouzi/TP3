package Activity4;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

	public View(Observable observable) {
		// TODO Auto-generated constructor stub
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		NotificationData ndata=(NotificationData)arg;
		System.out.println("affichage1:"+ndata.getNotification());
		System.out.println("affichage2:"+ndata.getNumberNotification());
	}

}
