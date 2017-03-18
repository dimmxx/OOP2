package recursion;

/**
 * Created by ddimmxxgmail.com on 3/12/17.
 */
public class Recursive {

    public static void main(String[] args) {

        foo(0);
        System.out.println();
        foo1(0);

    }

    static void foo (int a){
        if (a == 2) return;
        System.out.print(a);
        foo(++a);
        System.out.print(a);
    }

    static void foo1 (int a){

        System.out.print(a);

        if (a < 2)foo1(++a);

        System.out.print(a);

    }



}
