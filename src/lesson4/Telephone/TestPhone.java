package lesson4.Telephone;


/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class TestPhone {

    public static void main(String[] args) {

        Phone nokia = new Phone ("Nokia");
        SimCard life = new SimCard("life:)", 100, 1);
        SimCard mts = new SimCard("MTS",500, 3);
        //Contact contact1 = new Contact("Dima", 672998553);
        //Contact contact2 = new Contact("Lena", 504435766);


        System.out.println(life.getSimName() + " balance: " + life.getBalance());
        System.out.println(mts.getSimName() + " balance: " + mts.getBalance());
        System.out.println("Refilling " + life.getSimName() + "...");
        nokia.refillBalance(100, life);
        System.out.println(life.getSimName() +" balanchde: " + life.getBalance());
        System.out.println("Refilling " + mts.getSimName() + "...");
        nokia.refillBalance(500, mts);
        System.out.println(mts.getSimName() + " balance: " + mts.getBalance());
        System.out.println();

       nokia.newContact();
        //nokia.newContact();
        //nokia.newContact();

        nokia.showContacts();


        nokia.makeCall(life, 0, 250);

        System.out.println(life.getSimName() + " balance: " + life.getBalance());
        System.out.println(mts.getSimName() + " balance: " + mts.getBalance());



    }







    }





