package lesson6;

/**
 * Created by ddimmxxgmail.com on 2/19/17.
 */
public class Car implements BaseCar{

    @Override
    public void start() {
        System.out.println("START");
    }

    @Override
    public void stop() {
        System.out.println("STOP");

    }

    @Override
    public void drive() {
        System.out.println("DRIVE");

    }
}
