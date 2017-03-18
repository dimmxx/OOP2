package lesson3;

import java.util.Scanner;

/**
 * Created by ddimmxxgmail.com on 2/11/17.
 */
public class Person {

    Scanner scan = new Scanner(System.in);


    public String name;
    public String surname;
    public Integer age;

    public void about() {
        System.out.println("Name: " + name
                + "\nSurname: " + surname
                + "\nAge: " + age);

    }

/*
    protected  getData (String nameObj){

        Person pers = new Person(nameObj);

        name = scan.nextLine();
        surname = scan.nextLine();
        age = scan.nextInt();

        return pers;

*/


    public void persGo(Person pers, String str) {
        System.out.println("My name is " + pers.name + " and I go to " + str);

    }


    public void persGoWork(){
        System.out.println("My name is " + name + " and I go to work");
    }

}

