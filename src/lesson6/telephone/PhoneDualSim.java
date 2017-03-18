package lesson6.telephone;

/**
 * Created by ddimmxxgmail.com on 2/25/17.
 */
public class PhoneDualSim extends Phone{

    Sim sim1;



    public PhoneDualSim (String brand, String model, Sim sim0, Sim sim1) {
        super(brand, model, sim0);
        this.sim1 = sim1;
    }

    @Override
    public void aboutPhone(){
        super.aboutPhone();
        System.out.println(sim1.getOpName());

    }








}
