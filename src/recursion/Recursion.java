package recursion;

import java.util.Arrays;

/**
 * Created by ddimmxxgmail.com on 3/11/17.
 */
public class Recursion {

    public static int[] array = new int[10];
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) {

        foo(10);
        System.out.println();
        fooRev(10);
        System.out.println();

        fooPol(10);

        System.out.println();


        fooAr(0);
        System.out.println(Arrays.toString(array));


        fooStar();

        fooPolString(10);
        System.out.println(sb.toString());

    }

    public static void foo(int a) {
        if (a == -1) return;
        System.out.print(a + " ");
        foo(--a);
    }


    public static void fooRev(int a) {
        if (a == -1) return;
        fooRev(--a);
        System.out.print(++a + " ");
    }

    public static void fooPol(int a) {
        if (a == -1) return;


        System.out.print(a + " ");
        fooPol(--a);
        System.out.print(++a + " ");

    }


    public static void fooAr(int a) {
        if (a == array.length) return;
        array[a] = (int) (Math.random() * 10000);
        fooAr(++a);
    }


    public static void fooStar() {

    }


    public static String fooPolString(int a){

        if (a == 0) {
            sb.append(a + " ");
            return null;
        }
        sb.append(a + " ");
        fooPolString(--a);

        sb.append(++a + " ");

        return sb.toString();
    }


}


