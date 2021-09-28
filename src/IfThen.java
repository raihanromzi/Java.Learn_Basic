public class IfThen {
    public static void main (String[] args){
        boolean isAlien = false;

//      Without code block {}, executed only 1 line of command
        if (isAlien == true)
            System.out.println("It is not an alien!"); // Print when if is true
            System.out.println("And i am scared oh aliens"); // Always printed.

//      With code block
        if (isAlien == false){
            System.out.println("A");
            System.out.println("B");
        }

        int topscore = 10;
        if (topscore <= 100){
            System.out.println("High Score");
        }

//      AND Operator (Both true)
        int secondTopscore = 60;
        if ((topscore < secondTopscore) && (topscore < 100)){
            System.out.println("C");
        }

//      OR Operator (one True)
        if ((topscore < secondTopscore) || (topscore < 100)) {
            System.out.println("OR Operator");
        }

//      Assignment (==)
        int newNum = 50;
        if (newNum ==  50) {
            System.out.println("This is error");
        }

        boolean isCar = false;
        if (!isCar){ // Not operator
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

        if(!checkValue) {
            System.out.println("Got some remainder");
        }


    }
}
