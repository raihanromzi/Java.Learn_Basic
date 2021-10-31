package data_structure.array;

import java.util.Scanner;

public class ResizingArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Input 10 Number : ");
        getInput();
        printArray(baseData);

        System.out.println("");

        System.out.print("Input New Array Size = ");
        int i = scanner.nextInt();

        System.out.println("Input " + i + " Number : ");
        resizeArray(i);
        getInput();
        printArray(baseData);
    }

    private static void getInput(){
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void resizeArray(int n){
        int[] original = baseData;

        baseData = new int[n];
        for(int i = 0; i < baseData.length; i++){
            baseData[i] = original[i];
        }
    }
}
