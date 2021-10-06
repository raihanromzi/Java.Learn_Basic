package basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      ==================== 1: HELLO WORLD ====================
        System.out.println("Hello World");
        System.out.println("Hello, People");

        int myFirstNumber = (5 + 5) + (5 * 5);
        int mySecondNumber = 12;
        int myTotal = myFirstNumber + mySecondNumber;
        int myLastOne = 1000 - myTotal;

        System.out.print("First Number = ");
        System.out.println(myFirstNumber);

        System.out.print("Second Number = ");
        System.out.println(mySecondNumber);

        System.out.print("Total = ");
        System.out.println(myTotal);

        System.out.print("1000 Less = ");
        System.out.println(myLastOne);


//      ==================== 2: VARIABLES ====================
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
//      int myNum = 10000;
        int myMinIntValue = Integer.MIN_VALUE; //-2147483648
        int myMaxIntValue = Integer.MAX_VALUE; //2147483647

//      LONG (64 BITS)

//      long myLongNumber = 100L;
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
        System.out.println("Char is = " + myChar);
        System.out.println("Unicode is = " + myUnicode);
        boolean myBooleanT = true;
        boolean myBooleanF = false;

//      STRING
        String myString = "This String";
        int myNum2 = 50;
        String myNumString = "10";
        System.out.println("My string is = " + myString);
        System.out.println("Add 2 String " + myNum2 + myNumString);

//      USING "_" TO MAKE IT EASIER TO READ
//      int myMaxIntValueTest = 2_147_483_647;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

//      OVERFLOW AND UNDERFLOW
        System.out.println("Max int Value + 1 = " + (myMaxIntValue + 1));
        System.out.println("Min int Value + 1 = " + (myMinIntValue - 1));

//      CASTING
        int myTotal2 = (myMinIntValue / 2);
        System.out.println(myTotal2);

//      byte myTotalByte = (myMinByteValue / 2); Error because inside () is treated as INT
        byte myNewByte = (byte) (myMinByteValue / 2);
        System.out.println("Casting INT to BYTE = " + myNewByte);

        short myNewShort = (short) (myMinShortValue / 2);
        System.out.println("Casting INT to Short = " + myNewShort);


//      ==================== 3: OPERATOR ====================
        //      Operator: + , Operand = 1,2 , Expression = 3
        int result = 1 + 2;
        int result2 = 1 * 2;
        int result3 = 4 / 2;
        int result4 = 20 % 3; //Mod

        System.out.println("1 + 2 = " + result);
        System.out.println("1 * 2 = " + result2);
        System.out.println("4 / 2 = " + result3);
        System.out.println("20 Mod 3 = " + result4);

        result++; // result = result + 1 = 3 + 1
        System.out.println("Result = " + result);

        result--; // result = result - 1 = 4 - 1
        System.out.println("Result = " + result);

        result += 2; //result = result + 2 = 3 + 2
        System.out.println("Result = " + result);

        result *= 10; //result = result * 10 = 5 * 10
        System.out.println("Result = " + result);

        result /= 10; //result = result / 10 = 50 / 10 = 5
        System.out.println("Result = " + result);

        result -= 2; //result = result - 2 = 5 - 2 = 3
        System.out.println("Result = " + result);


//      ==================== 4: IF THEN ====================
        boolean isAlien = false;
//      Without code block {}, executed only 1 line of command
        if (isAlien == true)
            System.out.println("It is not an alien!"); // Print when if is true
        System.out.println("And i am scared oh aliens"); // Always printed.

//      With code block
        if (isAlien == false) {
            System.out.println("Print A");
            System.out.println("Print B");
        }

        int topscore = 10;
        if (topscore <= 100) {
            System.out.println("High Score");
        }

//      AND Operator (Both true)
        int secondTopscore = 60;
        if ((topscore < secondTopscore) && (topscore < 100)) {
            System.out.println("Both True");
        }

//      OR Operator (one True)
        if ((topscore < secondTopscore) || (topscore < 100)) {
            System.out.println("OR Operator");
        }

//      Assignment (==)
        int newNum = 50;
        if (newNum == 50) {
            System.out.println("This is error");
        }

        boolean isCar = false;
        if (!isCar) { // Not operator
            System.out.println("This not supposed to happen");
        }

//      Ternary Operator (return true or false)
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is True");
        }

        int checkAge = 20;
        boolean isAge18 = (checkAge == 18) ? true : false;
        if (isAge18) {
            System.out.println("Age is 18");
        }

//      Challenge
        double value1 = 20.00d;
        double value2 = 80.00d;
        double value3 = ((value1 + value2) * 100.00d) % 40.00d;

        boolean checkValue = (value3 == 0) ? true : false;
        System.out.println(checkValue);

        if (!checkValue) {
            System.out.println("Got some remainder");
        }


//      ==================== 5: EXPRESSION AND KEYWORD ====================
//      CANNOT USE : Int, true, false, null AS VARIABLE
//      int Int = 6;
//      int true;

//      Expression = Variable + Values + Operator
        double kmToMile = (100 * 1.609344);
        if (kmToMile == 10000) {
            System.out.println("Wow Cool");
        }


//      ==================== 6: STATEMENTS, WHITESPACE, INDENTATION ====================
//      Statement is complete line, until ";"
        int myVar = 50;
        System.out.println("This is" +
                "Another" +
                "Line" +
                "Still more");

//      Same line statement
        int myVar1 = 50;
        myVar1++;
        System.out.println("Same line");
//      Indent make code easy to read (Reformat code)


//      ==================== 7: CODE BLOCK & IF ELSE ====================
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//      IF-ELSE 1 (with code block) -> Clear
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

//      IF-ELSE 2 (Only 1 Line)
        if (score == 5000) System.out.println("Your score was 5000");

//      IF-ELSE 3
        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score > 1000) {
            System.out.println("Your score was more than 1000");
        } else {
            System.out.println("Your score more 5000");
        }

//      IF-ELSE 4
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1_000;
            System.out.println("Your Final Score was " + finalScore);
        }


//      ==================== 8: METHOD ====================
//      Fill the parameters with value or
        calculateScore2(true, 800, 5, 100);

        calculateScore2(false, 10000, 8, 200);

//      Fill the parameters with variable name
        calculateScore2(gameOver, score, levelCompleted, bonus);

//      Return Value
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your Final Score is " + highScore);

//      CHALLENGE
        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Raihan", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Shindi", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Josh", highScorePosition);

//      Logic Test
        highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("Michel", highScorePosition);


//      ==================== 9: IMPORT METHOD FROM ANOTHER FILE ====================
//      SpeedConverter (java class file name).printConversion() (method);


//      ==================== 10: METHOD OVERLOADING ====================
//      Use the same name of method but using different (unique) parameters, the key different is name and parameters.
//      Overloading improve code readability, re-usability, easy to remember, consistency
        calculateScoreGame("Tim", 100);
        calculateScoreGame(100);
        calculateScoreGame();

        // calcFeetAndInchesToCentimeters(6.0, 0.0);


//      ==================== 11: SWITCH STATEMENTS ====================
//      4 Data type (Byte, short, char, int)
        int testNum = 5;
        switch (testNum) {
            case 1:
                System.out.println("Num is 1");
                break;
            case 2:
                System.out.println("Num is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Num is 3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

//      Challenge
        char testChar = 'A';
        switch (testChar) {
            case 'A':
                System.out.println("I Found You, A");
                break;
            case 'B':
                System.out.println("Im B");
                break;
            case 'C':
                System.out.println("No! Im C");
                break;
            case 'D':
                System.out.println("Hey! Im D");
                break;
            default:
                System.out.println("Im not A, B, C, D");
                break;
        }

        String month = "JANuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Nor sure");
                break;
        }

//      ==================== 12: LOOP ====================
//      for(init; termination; increment){
//
//      }

//      FOR LOOP
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
        }

        for (double i = 8.0; i >= 1.0; i--) {
            System.out.println(calculateInterest(10000.0, i));
        }

        int count = 0;
        for (int i = 2; i < 10; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
                if (count == 3) {
                    break;
                }
            }
        }
        System.out.println(", How many prime num = " + count);

//      WHILE LOOP
//      Checks the condition at the start before executing the block
        int num = 0;
        while (num != 5) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

//      DO WHILE LOOP
//      At least execute once

        int num2 = 0;
        do {
            System.out.print(num2 + " ");
            num2++;
        } while (num2 != 6);

        System.out.println();

        int testNum2 = 0;
        do {
            boolean even = isEvenNumber(testNum2);
            System.out.println("Number " + testNum2 + " is even? " + even);
            testNum2++;
        } while (testNum2 != 5);

//      Continue bypass all the code block, and start from beginning of while loop
//      Break = exit the loop
        testNum2 = 1;
        int count2 = 0;
        while (testNum2 <= 20) {
            testNum2++;
            if (!isEvenNumber(testNum2)) {
                continue;
            }
            System.out.println("Even number " + testNum2);
            count2++;
            if (count2 == 5) {
                break;
            }
        }
        System.out.println(count2);

//      ==================== 13: PARSING VALUE FROM STRING ====================
//      Convert string into another data type

        String numString = "2021.123";
        System.out.println("Number as String = " + numString);

        double number = Double.parseDouble(numString); // int number = Integer.parseInt(numString);
        System.out.println("Number as Integer = " + number);

        numString += 1;
        number += 1;

        System.out.println("Number as String + 1= " + numString);
        System.out.println("Number as Integer + 1 = " + number);

//      ==================== 14: USER INPUT ====================
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth : ");

        boolean hasNextInt = scanner.hasNextInt();

//      Check if the input is int, if not it will show error message
        if (hasNextInt) {

//      Scanner can parse from string to int using nextInt method
            int yearOfBirth = scanner.nextInt();
            int age = 2021 - yearOfBirth;

//      Handle next line character / string(enter key)
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

//      Use close always after use it, so it will not error in future
//      scanner.close();

//      READING INPUT CHALLENGE 1
        Scanner inputUser = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (i < 11) {
            System.out.println("Enter number #" + i);
            boolean nextInt = inputUser.hasNextInt();

            if (!nextInt) {
                System.out.println("Invalid Number");
            } else {
                int numberInput = inputUser.nextInt();
                sum += numberInput;
                i++;
            }
            inputUser.nextLine();
        }
        System.out.println("Sum = " + sum);

        inputUser.close();

//      READING INPUT CHALLENGE 2
        Scanner scanner2 = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstFlag = true;

        while (true) {
            System.out.println("Enter number : ");
            boolean isAnInt = scanner2.hasNextInt();

            if (isAnInt) {
                int numberFromUser = scanner2.nextInt();
                // Use flag to assign first number to minimum
                if(firstFlag){
                    firstFlag = false;
                    min = numberFromUser;
                    max = numberFromUser;
                }
                if (numberFromUser > max) max = numberFromUser;
                if (numberFromUser < min) min = numberFromUser;
            } else {
                System.out.println("Invalid Number");
                break;
            }

            scanner2.nextLine(); // Handle enter
        }

        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);

        scanner2.close();


    }


// -----------------------------------------------------------------------------------------------------


    //  ==================== EXTEND 8: METHOD ====================
//  Void -> Not Return anything
    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }

    //  Return an int
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
//      Put return outside IF
//      return -1;
//      When it was a `void` method, it didn't return anything meaning that the only purpose of the method was to
//      PRINT TO THE CONSOLE (NOT THE SAME AS RETURNING). Printing to the console doesn't save data in any way,
//      by returning value from your method, you can assign variables to the result, and you can implement further
//      logic using the result of your returned function's value.
    }

    //  CHALLENGE
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position "
                + highScorePosition + " on the high table");
    }

    public static int calculatedHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }


    //  ==================== EXTEND 9: METHOD OVERLOADING ====================
    public static void calculateScoreGame(String playerName, int score) {
        int playerScore = score * 1000;
        System.out.println("Player " + playerName + " Scored " + playerScore + " points");
    }

    public static void calculateScoreGame(int score) {
        int playerScore = score * 1000;
        System.out.println("unnamed Player scored " + playerScore + " points");
    }

    public static int calculateScoreGame() {
        System.out.println("no player no score");
        return 0;
    }


    //  ==================== EXTEND 12: LOOP ====================
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

}


