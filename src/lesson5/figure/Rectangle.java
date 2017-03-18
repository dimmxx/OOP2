package lesson5.figure;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by ddimmxxgmail.com on 2/18/17.
 */
public class Rectangle extends Figure {

    private Integer sideA;
    private Integer sideB;
    private Integer sideC;
    private Integer sideD;


    public Rectangle (String name, Integer sideA, Integer sideB, Integer sideC, Integer sideD){
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;

    }


    @Override
    public void about (){
        super.about();
        System.out.println(super.getName() + " " + "\nSide A: " + sideA + "\nSide B: " + sideB
                            + "\nSide C: " + sideC + "\nSide D: " + sideD);

    }

    @Override
    public void perimeter(){
        System.out.println(super.getName() + " perimeter is " + (sideA + sideB + sideC + sideD));

    }

    @Override
    public void area (){
        System.out.println(super.getName() + " area is " + (sideA * sideB));
    }





}
