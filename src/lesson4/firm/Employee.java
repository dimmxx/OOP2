package lesson4.firm;

/**
 * Created by ddimmxxgmail.com on 2/18/17.
 */
public class Employee {

    private String empName;
    private String empSurname;
    private String empSex;
    private String empDep;
    private Integer empSalary;
    private Integer empCard;
    private Integer empYear;
    private Integer empMonth;


    public Employee(String empName, String empSurname, String empSex, String empDep, Integer empSalary, Integer empCard, Integer empYear, Integer empMonth) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empSex = empSex;
        this.empDep = empDep;
        this.empSalary = empSalary;
        this.empCard = empCard;
        this.empYear = empYear;
        this.empMonth = empMonth;
    }
}
