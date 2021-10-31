package data_structure.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    /*
    private static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int temp = array.length;
        for(int i = 0; i < array.length;i++){
            reverseArray[temp - 1] = array[i];
            temp--;
        }

        System.out.println(Arrays.toString(reverseArray));
    }
     */

    private static int[] reverseArray(int[] array){
        int maxIndex = array.length - 1;
        int halfArray = array.length / 2;
        for(int i = 0; i < halfArray; i++){
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
            maxIndex--;
        }
        return array;
    }
}
