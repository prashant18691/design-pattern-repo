package patterns.observerpattern.observable;

import patterns.observerpattern.observer.INotificationAlertObserver;

public interface IInventoryObservable {
    public void add(INotificationAlertObserver observer);
    public void remove(INotificationAlertObserver observer);
    public void notifyObserver();

    public void setInventoryCount(int count);

    public int getInventoryCount();

    public String getProductName();
}
