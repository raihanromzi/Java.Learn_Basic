package data_structure.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number){
        int[] newArray = new int[number];
        System.out.println("Please enter " + number + " numbers : \r");

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array){
        System.out.println("Numbers in Arrays : ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
//      int[] sortedArray = new int[array.length];
//      Copy array
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }

//      Built in Java Copy Array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag){
           flag = false;
            for(int i = 0; i < sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
