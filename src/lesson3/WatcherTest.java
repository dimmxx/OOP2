package lesson3;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class WatcherTest {

    public static void main(String[] args) {


        Watcher.addOwners((int)(Math.random())*100 );

        Watcher.removeOwners(3);

        Watcher.addFriends(4);

        Watcher.removeFriends(1);

        Watcher.printInfo();


    }


}
