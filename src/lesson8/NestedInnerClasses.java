package lesson8;

/**
 * Created by ddimmxxgmail.com on 2/26/17.
 *
 *
 *
 *
 *
 */
public class NestedInnerClasses {

    int a = 23;
    private static int b = 35;


    class Inner{
        public void foo2(){
            NestedInnerClasses.b = 77;
            NestedInnerClasses.this.a = 177;
        }
    }


    static class Nested{

        public static void foo(){
            NestedInnerClasses.b = 44;
        }

    }


}
