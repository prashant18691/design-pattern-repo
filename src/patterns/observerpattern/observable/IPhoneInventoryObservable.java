package patterns.observerpattern.observable;

import patterns.observerpattern.observer.INotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneInventoryObservable implements IInventoryObservable {


    private final String product;
    private final List<INotificationAlertObserver> notificationAlertObservers;

    private int currentInventoryCount;

    public IPhoneInventoryObservable() {
        this.product = "iPhone";
        this.notificationAlertObservers = new ArrayList<>();
    }


    @Override
    public void add(INotificationAlertObserver observer) {
        this.notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(INotificationAlertObserver observer) {
        this.notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (INotificationAlertObserver observer : this.notificationAlertObservers) {
            observer.sendNotification();
        }
    }

    @Override
    public void setInventoryCount(int newCount) {
        if (this.currentInventoryCount == 0 && newCount > this.currentInventoryCount) {
            this.currentInventoryCount = newCount;
            notifyObserver();
            return;
        }
        this.currentInventoryCount = newCount;
    }

    @Override
    public int getInventoryCount() {
        return this.currentInventoryCount;
    }

    @Override
    public String getProductName() {
        return this.product;
    }
}
