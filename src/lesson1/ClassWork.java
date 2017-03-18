package lesson1;

/**
 *  Task0. Написать метод, который умеет менять местами самую большую и самую маленькую
 *  букву(по индексации чар) в строке. Метод получает строку, выводит в консоль ее до
 *  изменения и после.
 *
 *  Task1. Ввести с консоли строку с словами, символами и пробелами. Посчитать количество
 *  слов в предложении.
 *
 *  Task4. Верхний регистр.
 Напишите метод, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ всех слов в верхний регистр и результат выводит в консоль
 */


import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {


    public static void main(String [] args){

      Scanner scan = new Scanner (System.in);
      String str = scan.nextLine();

      changePlace(str);
       countWords(str);
       upperCase(str);
    }

    private static void changePlace (String str){
        System.out.println (str);
        char[] charArr = str.toCharArray();
        int maxInd = 0;
        int minInd = 0;
        char maxCh = 0;
        char minCh = 65535;
        for(int i = 0; i < charArr.length; i++){

            if (charArr[i] > maxCh & charArr[i] != ' '){
                maxInd = i;
                maxCh = charArr [i];
            }

            if (charArr[i] < minCh & charArr[i] != ' '){
                minInd = i;
                minCh = charArr[i];
            }
        }
        charArr[minInd] = maxCh;
        charArr[maxInd] = minCh;
        System.out.println(charArr);
        System.out.println(charArr.toString());
        System.out.println(new String(charArr));
        String str1 = new String(charArr);
        System.out.println(str1);

    }


    private static void countWords(String str){
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++){

            if (charArray[i] == ' ') {
                count += 1;
            }
        }
        count += 1;
        System.out.println("Number of words in the line is: " + count);

    }


    private static void upperCase(String str){

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            if (i == 0) charArray[i] = Character.toUpperCase(str.charAt(i));
            if (charArray[i] == ' ') charArray[i + 1] = Character.toUpperCase(charArray [i + 1]);
        }
        System.out.println(charArray);

    }
}
