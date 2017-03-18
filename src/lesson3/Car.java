package lesson3;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class Car {

    public String model;
    public String color;
    public static Integer year;
    public String number;


    public void printAbout(){
        System.out.println("Model: " + model
                                             + "\nColor: " + color
                                             + "\nYear: " + year
                                             + "\nNumber: " + number);
    }

}
