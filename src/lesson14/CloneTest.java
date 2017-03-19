package lesson14;

/**
 * Created by ddimmxxgmail.com on 3/19/17.
 */
public class CloneTest {


    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User ("Ivanov", 25);
        User user2 = user.clone();

        System.out.println(user + "\n" + user2);

        user.setAge(200);
        System.out.println(user + "\n" + user2);




    }






}
