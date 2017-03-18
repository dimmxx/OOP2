package lesson6.telephone;

/**
 * Created by ddimmxxgmail.com on 2/25/17.
 */
public class PhoneDemo {

    public static void main (String[] args){

        Sim lifeSim = new Sim("life:)", 100);
        Sim vodafoneSim = new Sim("Vodafone", 400);

        Phone phone1 = new Phone ("HTC", "M9", lifeSim);
        PhoneDualSim phone2 = new PhoneDualSim ("Lenovo", "A900", vodafoneSim, lifeSim);

      phone2.aboutPhone();

/*
       phone1.aboutPhone();
       phone2.aboutPhone();
       phone1.sim0.simInfo();
       phone2.sim0.simInfo();
       phone2.sim1.simInfo();
       phone2.sim0.refillBalance(30);
       phone2.sim0.checkBalance();
*/

    // phone2.makeCallDS(lifeSim);





    }


}
