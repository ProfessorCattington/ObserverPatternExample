import ObserverPackage.*;

public class Main {
    public static void main(String[] args) {

        NewsSource newsSource = new NewsSource<>();

        //subscribers
        newsSource.Subscribe(new AveragePerson());
        SubscriberInterface sportsFan = new SportsFan(); //this sub will be removed so we are keeping a handle on it
        newsSource.Subscribe(sportsFan);
        newsSource.Subscribe(new DoomScroller());

        //headlines
        newsSource.BreakingNews("weather", "Heavy rains all week.");
        newsSource.BreakingNews("business", "New factory to open.");
        newsSource.BreakingNews("sports", "Our team wins!");
        newsSource.BreakingNews("politics", "Mayor ignores calls to resign.");

        //unsub the sports fan (they aren't interested in the news anymore)
        System.out.println(">>>>Sports fan ends their news subscription...");
        newsSource.Unsubscribe(sportsFan);

        //more headlines
        newsSource.BreakingNews("weather", "It's raining footballs!");
        newsSource.BreakingNews("business", "Football stocks drop!");
        newsSource.BreakingNews("sports", "All-star breaks ankle!");
        newsSource.BreakingNews("politics", "Mayor to play for local team.");
    }
}
