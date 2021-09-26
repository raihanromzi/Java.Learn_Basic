import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args){

//      BYTE (8 BITS)
        byte myMinByteValue = Byte.MIN_VALUE; //-128
        byte myMaxByteValue = Byte.MAX_VALUE; //127
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);


//      SHORT (16 BITS)
        short myMinShortValue = Short.MIN_VALUE; //-32768
        short myMaxShortValue = Short.MAX_VALUE; //32767
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);


//      INTEGER (32 BITS)
        int myNum = 10000;
        int myMinIntValue = Integer.MIN_VALUE; //-2147483648
        int myMaxIntValue = Integer.MAX_VALUE; //2147483647

//      USING "_" TO MAKE IT EASIER TO READ
        int myMaxIntValueTest = 2_147_483_647;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

//      OVERFLOW AND UNDERFLOW
        System.out.println("Max int Value + 1 = " + (myMaxIntValue + 1));
        System.out.println("Min int Value + 1 = " + (myMinIntValue - 1));


//      LONG (64 BITS)
        long myLongNumber = 100L;

//      Without L in value = 100, Java detect as INT
        long myLongNumber2 = 100;

//      long bigNumInt = 2_147_438_647_123; ERROR

        long bigNumInt = 2_147_438_647_123L;
        long myMaxLongValue = Long.MAX_VALUE; //9223372036854775807
        long myMinLongValue = Long.MIN_VALUE; //-9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);

//      OVERFLOW AND UNDERFLOW
        System.out.println("Long Maximum + 1 = " + (myMaxLongValue + 1));
        System.out.println("Long Minimum + 1 = " + (myMinLongValue - 1));


//      CASTING
        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

//      byte myTotalByte = (myMinByteValue / 2); Error because inside () is treated as INT
        byte myNewByte = (byte) (myMinByteValue / 2);
        System.out.println("Casting INT to BYTE = " + myNewByte);

        short myNewShort = (short) (myMinShortValue / 2);
        System.out.println("Casting INT to Short = " + myNewShort);


//      FLOAT (32) AND DOUBLE (64)
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);


//      Error because java always treated as double variable
//      float javaAlwaysUseDouble = 5.34;
//      Casting to tell java to convert to float
        float myFloatValue = (float) 5.25;
        float myFloatValue2 = 5.25f;
        int myIntValue = 5 / 3;

//      Double is preferred
        double myDoubleValue = 5.25d;
        float floatValue = 5f / 3f; //1.6666666
        double doubleValue = 5d / 3d; //1.666666666666666667 //5.00 and 3.00 java will assume as Double auto
        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + floatValue);
        System.out.println("My Double Value = " + doubleValue);


//      CHAR (16) AND BOOLEAN
        char myChar = 'C';
        char myUnicode = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        boolean myBooleanT = true;
        boolean myBooleanF = false;


//      STRING
        String myString = "This String";
        int myNum2 = 50;
        String myNumString = "10";
        System.out.println("My string is " + myString);
        System.out.println(myNum2 + myNumString);


//      PRIMITIVE TYPE CHALLENGE
        byte byteNum = 10;
        short shortNum = 20;
        int intNum = 50;
        long totalNumLong = (50_000L + (10L * (byteNum + shortNum + intNum)));
        short totalNumShort = (short) (1000 + 10 * (byteNum + shortNum + intNum));

        System.out.println(totalNumLong);
        System.out.println(totalNumShort);


//      CHALLENGE
        double poundValue = 2d;
        double kilogramValue = 0.45359237d;
        System.out.println(poundValue * kilogramValue);
    }
}
