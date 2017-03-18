package lesson4.lesson4.car;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class Car {

    private String model;
    private String color;
    private Integer year;
    private String number;
    private Short maxSpeed;
    private Driver driver;

   /*
    public Car(){};
    */

    public Car(String model, Integer year){
        this.model = model;
        this.color = color;
    }

   public Car (String model, String color, Integer year){
       this (model, year); // вызов конструктора из конструктора
       this.color = color;

   }

   public Car (Car car){
       this (car.model, car.color, car.year);

   }

   /*
   Getter and Setter
    */

   public Short getMaxSpeed(){
       return maxSpeed;
   }

   public Driver getDriver(){
       return driver;
   }

   public void setMaxSpeed(Short maxSpeed){

       if (maxSpeed > 0) this.maxSpeed = maxSpeed;
   }


   public void setDriver (Driver driver){
       this.driver = driver;
   }









    public void printAbout(){
        System.out.println("Model: " + model
                + "\nColor: " + color
                + "\nYear: " + year
                + "\nNumber: " + number
                 + "\nDriver: ");
        //this.driver.about();
    }

}


