package ObserverPackage;

import java.util.HashSet;

public class NewsSource<T extends SubscriberInterface> {
    private HashSet<T> subscribers;

    public NewsSource() {
        subscribers = new HashSet<T>();
    }

    public void Subscribe(T subscriber) {
        subscribers.add(subscriber);
    }

    public void NotifySubscribers(String topic, String headline) {
        for (T subscriber : subscribers) {
            subscriber.update(topic, headline);
        }
    }

    public void BreakingNews(String topic, String headline) {
        System.out.println("===Breaking news=== ");
        System.out.println(headline);
        //...some other logic or behavior
        NotifySubscribers(topic, headline);
        //...more logic or behavior
    }
}
