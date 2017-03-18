package lesson8;

/**
 * Created by ddimmxxgmail.com on 2/26/17.
 */
public class DemoClass {


    public static void main(String[] args) {

        NestedInnerClasses nsi = new NestedInnerClasses();






        NestedInnerClasses.Inner inner = nsi.new Inner();

        //NestedInnerClasses.Inner inner = new NestedInnerClasses().new Inner();


        System.out.println(nsi.a + " " );





    }

}
