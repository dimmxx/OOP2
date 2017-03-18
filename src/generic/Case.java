package generic;

/**
 * Created by ddimmxxgmail.com on 3/11/17.
 */
public class Case <T>{

    private T val;
    private T str;


    public Case (T val, T str){
        this.val = val;
        this.str = str;
    }

    public T getVal (){
        return val;
    }

    public void setVal(T val){
        this.val = val;
    }

    public T getStr (){
        return str;
    }

    public void setStr (T str){
        this.str = str;
    }


    public void printAbout(){
        System.out.println("Val: " + val + " Type: " + val.getClass().getName());
        System.out.println("Str: " + str + " Type: " + str.getClass().getName());
    }



}
