package lesson4.lesson4.car;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class CarTest {

    public static void main(String[] args) {


       // Driver driver = new Driver("Dima", "Borisov");
        Car car1 = new Car("BMW", "white", 2016);
       // car1.driver = car1.setDriver(driver);

        car1.setMaxSpeed((short)200);


        car1.printAbout();
        System.out.println(car1.getMaxSpeed());





    }


}
