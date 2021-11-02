package data_structure.arrayList.Autoboxing_Unboxing;

import java.util.ArrayList;

class intClass{
    private int myInt;

    public intClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {
    public static void main(String[] args) {
//      Array
        String[] strings = new String[5];

//      Array List (Only save object)
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");
        for(int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }

//      Array List cannot save int (primitive type), we have to make object of int
        ArrayList<intClass> intArrayList = new ArrayList<>();
        intArrayList.add(new intClass(4));
        intArrayList.add(new intClass(10));
        for(int i = 0; i < intArrayList.size(); i++){
            System.out.println(intArrayList.get(i).getMyInt());
        }

//      Autoboxing (Integer is int class) we don't have to make Class of int because it's java feature
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        for(int i = 0; i <= 10; i++){
//          Example of Autoboxing -> Converting an integer to Integer(object)
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < integerArrayList.size(); i++){
//          Convert back to Integer(object)
            System.out.print(integerArrayList.get(i).intValue() + " "); //Shortcut integerArrayList.get(i)

        }

//      UnBoxing change Object to primitive type
        Integer myIntValue = 56; // Integer.valueOf(56); --> This is what happened in compile time
        int myInt = myIntValue.intValue(); // myInt.IntValue();


    }
}
