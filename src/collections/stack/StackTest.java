package collections.stack;

/**
 * Created by ddimmxxgmail.com on 2/26/17.
 */
public class StackTest {

    public static void main(String[] args) {


        ArrayStack stack = new ArrayStack(5);

        ArrayStack stack1 = new ArrayStack();
        stack1.push(2);


        stack.push(true);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack1.toString());

    }
}
