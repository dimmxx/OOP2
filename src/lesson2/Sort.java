package lesson2;

import java.util.Arrays;

/**
 * 1. Stupid sort
 * 2. Bubble sort
 * 3. Shake sort
 * 4. Selection sort
 * 5. Insertion sort
 * 6. Binar sort
 * 7. Linear sort
 *
 *
 */
public class Sort {

    public static void main(String[] args) {

        int arr[] = getArray(15);
        //int clone[] = getArrayCopy(arr);

        System.out.println("Original:    " + Arrays.toString(arr));
        System.out.println("Clone:       " + Arrays.toString(getArrayCopy(arr)));


        stupidSort(getArrayCopy(arr));
        bubbleSort(getArrayCopy(arr));
        shakerSort(getArrayCopy(arr));
        selectionSort(getArrayCopy(arr));
    }


    public static int[] getArray(int n) {
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int[] getArrayCopy(int[] arr) {
        int[] clone = new int[arr.length];
        System.arraycopy(arr, 0, clone, 0, arr.length);
        return clone;
    }

    public static void stupidSort(int[] clone) {
        int iterations = 0;
        for (int i = 0; i < clone.length - 1; i++) {
            if (clone[i] > clone[i + 1]) {
                int tmp = clone[i];
                clone[i] = clone[i + 1];
                clone[i + 1] = tmp;
                i = -1;
            }
        iterations ++;
        }

        System.out.println("Stupid Sort: " + Arrays.toString(clone));
        System.out.println("Iterations = " + iterations);

    }


    public static void bubbleSort (int [] clone){
        int iterations = 0;

        for (int i = clone.length - 1; i > 0; i-- ){

            for (int j = 0; j < i ; j++) {

                if (clone[j] > clone[j + 1]) {
                    int tmp = clone[j + 1];
                    clone[j + 1] = clone[j];
                    clone[j] = tmp;
                }
            iterations ++;
            }
         iterations ++;
        }

        System.out.println("Bubble Sort: " + Arrays.toString(clone));
        System.out.println("Iterations = " + iterations);
    }

    public static void shakerSort (int[] clone){
        int iterations = 0;


        System.out.println("Shake Sort: " + Arrays.toString(clone));
        System.out.println("Iterations = " + iterations);

        }



     public static void selectionSort(int[] clone){
        for (int i = 0; i < clone.length; i++){
            int min = clone[i];


        }




     }





}

