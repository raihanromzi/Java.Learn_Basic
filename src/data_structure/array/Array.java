package data_structure.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//      ==================== ARRAY ====================
//      New array, typed integer, and assign 10 elements to it.
        int[] myIntArray = new int[15];

//      Different way to assign element to array
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};

//      Using loop to assign element to array
        for(int i = 0; i < myIntArray.length;i++){
            myIntArray[i] = i * 10;
        }

//      Double array
        double[] myDoubleArray = new double[10];

//      Access array, save 50 to element number 6 (Start from 0)
        myIntArray[0] = 1;
        myIntArray[5] = 50;
        myDoubleArray[0] = 10.1;

        System.out.println(myIntArray2[6]);
        printArray(myIntArray);

//      ==================== REFERENCE TYPE & VALUE TYPE ====================
//      myIntValue holds a value of int
        int myIntValue = 10;
        int myIntValue2 = myIntValue;

//      newArr is Type reference, hold address of object
        int[] newArr = new int[5];
        int[] newArr2 = newArr;

//      Pointing/referencing the same array address
        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println("newArr2 = " + Arrays.toString(newArr2));

        newArr2[0] = 1;

//      Two Reference type hold the same address of array, so the output is same
        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println("newArr2 After Change = " + Arrays.toString(newArr2));

//      De-Reference
        newArr2 = new int[] {4,5,6,7,8};

        modifyArray(newArr);
        System.out.println("newArr = " + Arrays.toString(newArr));
        System.out.println("newArr2 After Modify = " + Arrays.toString(newArr2));

    }

//  Print Array to method
    public static void printArray(int[] nameArray) {
        for(int i = 0; i < nameArray.length; i++){
            System.out.println("Element " + i + " is = " + nameArray[i]);
        }
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}
