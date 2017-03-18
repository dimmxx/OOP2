package lesson3;

import java.util.Scanner;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class TestPerson {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person person1 = new Person();

        System.out.println("Name: ");
        person1.name = scan.nextLine();

        System.out.println("Surname: ");
        person1.surname = scan.nextLine();

        System.out.println("Age: ");
        person1.age = scan.nextInt();

        person1.about();

        person1.persGo (person1, "school");
        person1.persGoWork();

    }










}
