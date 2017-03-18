package lesson5.lesson5.car;

/**
 * Created by ddimmxxgmail.com on 2/18/17.
 */
public class TestCar {

    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("BMW");
        car.setNumber("AA744AA");
        car.setColour("grey");
        car.setYear(1999);


        Truck truck = new Truck();

        truck.setModel("Volvo");
        truck.setNumber("AA7777AA");
        truck.setColour("orange");
        truck.setYear(2001);

        truck.setCapacity(30);
        truck.setTrailer(true);

        car.aboutCar();

        truck.aboutCar();
        truck.aboutTruck();

        car.about();
        truck.about();



    }



}
