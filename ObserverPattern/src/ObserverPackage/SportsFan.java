package ObserverPackage;

public class SportsFan implements SubscriberInterface {

    public void update(String topic, String data) {
        System.out.print("Sports fan thinks: ");
        if (topic.contains("sports")) {
            System.out.println("Awesome! We're going to the finals!");
        } else {
            System.out.println("Meh...");
        }
    }
}
