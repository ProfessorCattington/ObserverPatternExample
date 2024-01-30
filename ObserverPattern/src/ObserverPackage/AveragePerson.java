package ObserverPackage;

public class AveragePerson extends Object implements SubscriberInterface {

    public void update(String topic, String data) {
        System.out.print("Average person thinks: ");
        System.out.println("That's nice... ");
    }
}
