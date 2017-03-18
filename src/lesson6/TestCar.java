package lesson6;

/**
 * Created by ddimmxxgmail.com on 2/19/17.
 */
public class TestCar {

    public static void main(String[] args) {

        Truck truck = new Truck();
        BusCar bus = new BusCar();


        truck.start();
        truck.drive();
        truck.stop();
        truck.cargo();
        System.out.println(truck.FUEL_TANK);

        bus.pass();


    }


}
