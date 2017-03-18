package lesson4.Telephone;

/**
 * Created by ddimmxxgmail.com on 2/12/17.
 */
public class SimCard {

    private  String simName;
    private Integer balance;
    private Integer plan;


    public SimCard(String simName, Integer balance, Integer plan) {
        this.simName = simName;
        this.balance = balance;
        this.plan = plan;
    }

    public String getSimName() {
        return simName;
    }

    public  void setSimname(String simName){
        this.simName = simName;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }


}

