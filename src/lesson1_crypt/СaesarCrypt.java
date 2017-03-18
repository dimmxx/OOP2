package lesson1_crypt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 Task5. Шифр Цезаря с ключом например 3.
 Написать метод, который принимает имя файла и шифрует содержимое файла шифром Цезаря,
 результат записать в новый файл
 Реализовать Шифрование (каждый символ смещается по таблице символов на 3 элемента вправо A в D)
 и Дешифрование (каждый символ смещается по таблице символов на 3 элемента влево E в B)
 Например: abc15 2b -> def48 5e
 Изначально файл содержит несколько строк. Пробелы и переходы на следующую строку не шифруются.

 */

public class СaesarCrypt {


    public static void main(String[] args) throws IOException {

        String fileIn = "/Users/ddimmxxgmail.com/input.txt";
        String fileOut = "/Users/ddimmxxgmail.com/output.txt";
        String fileKey = "/Users/ddimmxxgmail.com/key.dat";
        int key = getKey(fileKey);
        System.out.println("key " + key);


        cryptMe(fileIn, fileOut, key);
        deCryptMe(fileOut, key);

    }

    private static int getKey(String fileKey) throws IOException {
        FileReader frKey = new FileReader(fileKey);
        int keyChar = frKey.read();
        int key = Character.digit(keyChar, 10);
        return key;
    }


    private static void cryptMe (String fileIn, String fileOut, int key) throws IOException {

        FileReader fr = new FileReader(fileIn);
        FileWriter fw = new FileWriter(fileOut);
        Scanner scan = new Scanner(fr);

     while(scan.hasNextLine()) {

         String str = scan.nextLine();
         char[] charArr = str.toCharArray();
         for (int i = 0; i < charArr.length; i++) {
             if (charArr[i] != ' ') charArr[i] += key;
         }
         str = new String (charArr);
         fw.write(str);
         fw.append('\n');
         fw.flush();
     }
       fr.close();
       fw.close();
       scan.close();
    }

    private static void deCryptMe (String fileOut, int key) throws FileNotFoundException {


        FileReader fr = new FileReader(fileOut);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            char[] charArr = str.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] != ' ') charArr[i] -= key;

            }

            System.out.println(charArr);
        }

    }


}




