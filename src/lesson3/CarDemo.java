package lesson3;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class CarDemo {

    public static void main (String args[]){
        Car car1 = new Car();
        car1.model = "Land Rover";
        car1.color = "green";
        car1.year = 1992;
        car1.number = "AA4563HX";

        Car car2 = new Car ();
        car2.model = "Ford Mustang";
        car2.color = "red";
        //car2.year = 1967;
        car2.number = "6575KX";

        car1.printAbout();
        System.out.println();
        car2.printAbout();

        System.out.println(Car.year);

    }

}
