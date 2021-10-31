package data_structure.array;

import java.util.Scanner;

public class MinimumElement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int [] array = readIntegers(count);
        System.out.println("The minimum number in array is " + findMin(array));
    }

    private static int[] readIntegers(int count){
        int [] array = new int[count];
        System.out.println("Enter number : ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }

    private static int findMin(int[] array){
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < array.length-1; i ++){
                if(array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
        return array[0];
    }
}
