public class Variables {
    public static void main(String[] args){

//      BYTE VARIABLE (8 BITS)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);


//      SHORT VARIABLE (16 BITS)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);


//      INTEGER VARIABLE (32 BITS)
        int myNum = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

//      USING "_" TO MAKE IT EASIER TO READ
        int myMaxIntValueTest = 2_147_483_647;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Max int Value + 1 = " + (myMaxIntValue + 1));
        System.out.println("Min int Value + 1 = " + (myMinIntValue - 1));


//      LONG VARIABLE (64 BITS)
        long myLongNumber = 100L;

//      Without L in value = 100, Java detect as INT
        long myLongNumber2 = 100;

//      long bigNumInt = 2_147_438_647_123; ERROR

        long bigNumInt = 2_147_438_647_123L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;

        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);

//      OVERFLOW AND UNDERFLOW
        System.out.println("Long Maximum + 1 = " + (myMaxLongValue + 1));
        System.out.println("Long Minimum + 1 = " + (myMinLongValue - 1));

//      Casting
        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

//      byte myTotalByte = (myMinByteValue / 2); Error because inside () is treated as INT
        byte myNewByte = (byte) (myMinByteValue / 2);
        System.out.println("Casting INT to BYTE = " + myNewByte);

        short myNewShort = (short) (myMinShortValue / 2);
        System.out.println("Casting INT to Short = " + myNewShort);
    }
}
