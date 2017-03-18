package lesson6;

/**
 * Created by ddimmxxgmail.com on 2/19/17.
 */
public class Truck extends Car implements CargoCar{


    @Override
    public void cargo() {
        System.out.println("CARGO");

    }
}
