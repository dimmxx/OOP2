package lesson1;

import java.util.Arrays;

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


        int [] arr1 = new int [50];
        int j = 0;

        for(int i : arr1){
            i = 7;
            System.out.println(i + " " + j );
            j++;
            //i = 1; //(int)((Math.random()*100));


        }
        System.out.println(arr1[0]);








    }


}

