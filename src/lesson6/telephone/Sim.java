package lesson6.telephone;

/**
 * Created by ddimmxxgmail.com on 2/20/17.
 */
public class Sim implements Simable {

    private String opName;
    private Integer balance;



    public Sim (String opName, Integer balance){
        this.opName = opName;
        this.balance = balance;
    }



    @Override
    public void checkBalance() {
        System.out.println(balance);

    }

    @Override
    public void refillBalance(Integer money) {
        this.balance += money;

    }

    @Override
    public void simInfo() {
        System.out.println("Sim name is: " + opName + "\nBalance is: " + balance);

    }


    public String getOpName (){
        return opName;
    }
}
