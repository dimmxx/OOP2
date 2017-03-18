package lesson7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ddimmxxgmail.com on 2/25/17.
 */
public class CryptExc {


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
        FileReader frKey = null;
        BufferedReader brKey = null;
        try {
            frKey = new FileReader(fileKey);
            brKey = new BufferedReader(frKey);
        } catch (IOException exc){
            System.out.println("Key file not found in " + fileKey);
            System.out.println("Crypting cannot be applied");
            return 0;

        }finally {
            //frKey.close();
            //brKey.close();
        }
            String keyChar = brKey.readLine();
            System.out.println(keyChar);
            int key = Integer.parseInt(keyChar);
            //frKey.close();
            //brKey.close();


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
