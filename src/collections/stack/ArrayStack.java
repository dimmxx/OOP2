package collections.stack;

import java.util.Arrays;

/**
 * Created by ddimmxxgmail.com on 2/26/17.
 */
public class ArrayStack <E> implements Stack <E> {

    final static int DEFAULT_CAPACITY = 10;
    E [] elementData;
    int count = 0;


    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int length){
        elementData = (E[]) new Object [length];
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++){
            sb.append(elementData[i]);
            if (count > 1 & i != count -1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }



    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < count; i++){
            System.out.print(elementData[i]);
            if (count > 1 & i != count -1) System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }




    @Override
    public boolean push(E el) {
        if(count == elementData.length) count--;
        elementData[count] = el;
        count++;
        System.out.println(Arrays.toString(elementData) + " i = " + count);
        return true;
    }

    @Override
    public E pop() {
        if (count != 0){
            E el = elementData[count - 1];
            elementData[count - 1] = null;
            count--;
            System.out.println(Arrays.toString(elementData) + " i = " + count);
            return el;}
        else {
            System.out.println("Cannot pop. End of ArrayStack");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    @Override
    public boolean isFull() {
        if ((count) == elementData.length) return true;
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public E peek() {
        if (count != 0){
            E el = elementData[count - 1];
            return el;
        }
        return null;
    }

    @Override
    public boolean search(E el) {
        return false;
    }
}
