package ObserverPackage;

import java.util.HashSet;

public class NewsSource<T extends SubscriberInterface> {
    private HashSet<T> subscribers;

    public NewsSource() {
        subscribers = new HashSet<T>();
    }

    //method for subscribers to be added to the set
    public void Subscribe(T subscriber) {
        subscribers.add(subscriber);
    }

    //call this when you want your subscribers to be notified about a new topic and headline
    public void NotifySubscribers(String topic, String headline) {
        for (T subscriber : subscribers) {
            subscriber.update(topic, headline);
        }
    }

    //method to demonstrate the notification behaviors of the subscribers
    public void BreakingNews(String topic, String headline) {
        System.out.println("===Breaking news=== ");
        System.out.println(headline);
        //...some other logic or behavior
        NotifySubscribers(topic, headline);
        //...more logic or behavior
    }
}
