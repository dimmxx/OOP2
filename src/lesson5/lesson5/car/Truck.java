package lesson5.lesson5.car;

/**
 * Created by ddimmxxgmail.com on 2/18/17.
 */
public class Truck extends Car {

    private Integer capacity;
    private Boolean trailer;
    static String className = "Truck";

   public Truck(){
       super("model", "number", "colour", 0);
    }


    public Truck(String model, String number, String colour, Integer year,
                 Integer capacity, Boolean trailer) {
        super(model, number, colour, year);
        this.capacity = capacity;
        this.trailer = trailer;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setTrailer(Boolean trailer) {
        this.trailer = trailer;
    }

    public Integer getCapacity() {

        return capacity;
    }

    public Boolean getTrailer() {
        return trailer;
    }



    public void aboutTruck() {

        this.aboutCar();
        System.out.println();

        System.out.println(this.capacity + " " + this.trailer + " " + className);

    }


    @Override
    public void about (){
        System.out.println(super.getModel() + " "
                + super.getNumber() + " " + super.getColour() + " " + super.getYear() +
                this.capacity + " " + this.trailer + " " + className);

    }





}

