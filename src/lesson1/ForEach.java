package lesson1;

/**
 * Created by ddimmxxgmail.com on 3/18/17.
 */
public class ForEach {


    public static void main(String[] args) {


        int [] arr = {1, 2, 3, 4};
        int sum = 0;


        for (int i : arr){
            sum++;
            System.out.println(i + " " + sum);
        }


    }


}

