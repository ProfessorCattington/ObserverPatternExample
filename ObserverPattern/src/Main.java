import ObserverPackage.AveragePerson;
import ObserverPackage.DoomScroller;
import ObserverPackage.NewsSource;
import ObserverPackage.SportsFan;

public class Main {
    public static void main(String[] args) {

        NewsSource newsSource = new NewsSource<>();

        //subscribers
        newsSource.Subscribe(new AveragePerson());
        newsSource.Subscribe(new SportsFan());
        newsSource.Subscribe(new DoomScroller());

        //headlines
        newsSource.BreakingNews("weather", "Heavy rains all week.");
        newsSource.BreakingNews("business", "New factory to open.");
        newsSource.BreakingNews("sports", "Our team wins!");
        newsSource.BreakingNews("politics", "Mayor ignores calls to resign.");
    }
}
