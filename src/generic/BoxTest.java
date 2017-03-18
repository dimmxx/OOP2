package generic;

/**
 * Created by ddimmxxgmail.com on 3/5/17.
 */
public class BoxTest {


    public static void main(String[] args) {

        Box <Double, String> box = new Box<>(7.8, "fff");
        Box <Integer, String> box1 = new Box<>(44, "qqq");
        Box <Integer, Boolean> box2 = new Box<>(88, true);

        box.printAbout();
        box1.printAbout();
        box2.printAbout();


    }
}
