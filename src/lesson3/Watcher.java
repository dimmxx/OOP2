package lesson3;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class Watcher {

    private static int owners = 0;
    private static int friends = 0;


    public static void addOwners (int count){
        owners = owners + count;
    }

    static void addFriends (int count){
        friends = friends + count;
    }

    static void removeOwners (int count){
        owners = owners - count;
    }
    static void removeFriends (int count){
        friends = friends  - count;
    }

    public static void printInfo (){
        System.out.println(owners + "  " + friends);
    }






}
