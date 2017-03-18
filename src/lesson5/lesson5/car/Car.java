package lesson5.lesson5.car;

/**
 * Created by ddimmxxgmail.com on 2/18/17.
 *
 *
 * НАСЛЕДОВАНИЕ
 * процесс создания класса на основе уже существующего класса с целью уменьшения дублирования кода
 * процеес наследования - копирование полей одного класса в другой
 *
 *
 */


public class Car {

    private String model;
    private String number;
    private String colour;
    private Integer year;
    static String className = "Car";


    public Car(){

    }

    public Car(String model, String number, String colour, Integer year) {
        this.model = model;
        this.number = number;
        this.colour = colour;
        this.year = year;
    }




    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }

    public Integer getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(Integer year) {
        this.year = year;
    }



    public void aboutCar (){
        System.out.println(this.model + " "
        + this.number + " " + this.colour + " " + this.year + " " + className);

    }

    public void about (){
        System.out.println(this.model + " "
                + this.number + " " + this.colour + " " + this.year + " " + className);

    }


}
