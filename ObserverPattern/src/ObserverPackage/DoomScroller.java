package ObserverPackage;

public class DoomScroller implements SubscriberInterface {

    public void update(String topic, String data) {
        System.out.print("Doom scroller thinks:");
        if (topic.contains("politics") || topic.contains("weather")) {

            System.out.println("It just keeps getting worse!");
        } else {
            System.out.println("(They didn't even read the story)");
        }
    }
}
