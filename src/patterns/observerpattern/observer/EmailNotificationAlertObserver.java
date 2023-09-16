package patterns.observerpattern.observer;

import patterns.observerpattern.observable.IInventoryObservable;

public class EmailNotificationAlertObserver implements INotificationAlertObserver{

    private final IInventoryObservable observable;
    private final String email;

    public EmailNotificationAlertObserver(IInventoryObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println(this.observable.getInventoryCount() +" "+ this.observable.getProductName()+ " in stock. Sending mail to "+this.email);
    }
}
