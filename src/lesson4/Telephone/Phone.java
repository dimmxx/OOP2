package lesson4.Telephone;

import java.util.Scanner;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class Phone {

    private String model;
    private SimCard simcard;
    private Contact[] phoneBook = new Contact[200];
    private Integer counter = 0;


    public Phone (String model){
        this.model = model;
    }

    public Phone (String model, SimCard simcard){
        this.model = model;
        this.simcard = simcard;
    }

    public String getModel(){
        return model;
    }

    public SimCard getSimcard() {
        return simcard;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSimcard(SimCard simcard) {
        this.simcard = simcard;
    }

    public void refillBalance (Integer money, SimCard simcard){
        simcard.setBalance(simcard.getBalance() + money);
    }

    public void newContact (){

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            System.out.println("Enter number: ");
            Integer number = scan.nextInt();
           // Contact contact = new Contact(name, number);
            phoneBook[counter] = new Contact(name, number);
            //phoneBook[counter] = contact;
            counter++;
            System.out.println("Contact was added. Free space left: " + (200 - counter));

    }

    public void showContacts (){
        for (int i = 0; i < counter; i++){
            System.out.println(phoneBook[i].getName() + " " + phoneBook[i].getNumber());
        }
    }



    public void makeCall (SimCard simCard,  Integer index, Integer minutes){

        //Integer index = (int)(Math.random() * phoneBook.length);
        //System.out.println(index);

        if (simCard.getBalance() <= 0) {
            System.out.println("Please refill the balance");
        } else {
            System.out.println("Making call to " + phoneBook[index].getName()
                                             + " with " + simCard.getSimName());
        }
        if (simCard.getBalance() >= simCard.getPlan() * minutes){
            System.out.println("You have balance to make the call...");
            simCard.setBalance(simCard.getBalance() - simCard.getPlan() * minutes);
        } else {
            System.out.println("You have balance to make " + simCard.getBalance()/simCard.getPlan() + " minute call");
            simCard.setBalance(0);
        }




    }




}
