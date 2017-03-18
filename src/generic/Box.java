package generic;

/**
 * Created by ddimmxxgmail.com on 3/5/17.
 */
public class Box <T extends Number, U> {

    private T val;
    private U str;

    public Box(T val, U str){
        this.val = val;
        this.str = str;
    }


    public T getVal() {
        return val;
    }

    public U getStr() {
        return str;
    }

    public void printAbout(){
        System.out.println("Value " + val + "\nType " + val.getClass().getName());
        System.out.println("Value " + str + "\nType " + str.getClass().getName());
        System.out.println();
    }

}
