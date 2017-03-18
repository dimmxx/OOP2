package lesson4.Telephone;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class Contact {

    private String name;
    private Integer number;


    public Contact(String name, Integer number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
