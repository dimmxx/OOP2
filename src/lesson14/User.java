package lesson14;

/**
 * Created by ddimmxxgmail.com on 3/19/17.
 */
public class User implements Comparable <User>, Cloneable {

    private String name;
    private Integer age;



    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return getName() + " " + getAge();

    }
    @Override
    public int compareTo (User o){
        //return this.getName().compareTo(o.getName());
        return o.getAge() - this.getAge();

    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
