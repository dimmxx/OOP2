package lesson6;

/**
 * Created by ddimmxxgmail.com on 2/19/17.
 */
public class Number implements Num, NumInfo{

    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer min(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer mul(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        if (b != 0) return a/b;
        else return 0;
    }

    @Override
    public void print() {

    }
}
