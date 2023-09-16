package patterns.observerpattern;

import patterns.observerpattern.observable.IInventoryObservable;
import patterns.observerpattern.observable.IPhoneInventoryObservable;
import patterns.observerpattern.observer.EmailNotificationAlertObserver;
import patterns.observerpattern.observer.INotificationAlertObserver;
import patterns.observerpattern.observer.PushNotificationAlertObserver;

class Main {
     public static void main(String[] args) {



         IInventoryObservable iPhoneInventoryObservable = new IPhoneInventoryObservable();

         INotificationAlertObserver observer1 = new EmailNotificationAlertObserver(iPhoneInventoryObservable, "prs@xyz.com");
         INotificationAlertObserver observer2 = new PushNotificationAlertObserver(iPhoneInventoryObservable, "1234");

         iPhoneInventoryObservable.add(observer1);
         iPhoneInventoryObservable.add(observer2);

         iPhoneInventoryObservable.setInventoryCount(10);
     }
}
