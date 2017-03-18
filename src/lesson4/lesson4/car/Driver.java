package lesson4.lesson4.car;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class Driver {


    public String name;
    public String surname;

    public Driver (String name, String surname){
        this.name = name;
        this.surname = surname;
    }


    public void about() {
        System.out.println("Name: " + name
                + "\nSurname: " + surname);


        }
    }

