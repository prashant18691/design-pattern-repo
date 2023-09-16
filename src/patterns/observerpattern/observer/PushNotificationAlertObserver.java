package patterns.observerpattern.observer;

import patterns.observerpattern.observable.IInventoryObservable;

public class PushNotificationAlertObserver implements INotificationAlertObserver{

    private final String deviceId;
    private final IInventoryObservable observable;

    public PushNotificationAlertObserver(IInventoryObservable observable, String deviceId) {
        this.deviceId = deviceId;
        this.observable = observable;
    }

    @Override
    public void sendNotification() {
        System.out.println(this.observable.getInventoryCount() +" "+ this.observable.getProductName()+ " in stock. Sending push notification to "+this.deviceId);
    }
}
