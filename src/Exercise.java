public class Exercise {
    public static void main(String[] args) {
        checkNumber(10);

        printConversion(1.0);

        printMegaBytesAndKiloBytes(1024);

        boolean testBarking = shouldWakeUp(false, 2);
        System.out.println(testBarking);

        boolean testLeapYear = isLeapYear(1800);
        System.out.println(testLeapYear);

        boolean testEqual = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(testEqual);

        boolean testSumChecker = hasEqualSum(1,1,2);
        System.out.println(testSumChecker);

    }


    //  ======== 1: CHECK POSITIVE NEGATIVE ZERO NUMBER ========
    public static void checkNumber(int myNumber) {
        if (myNumber == 0) {
            System.out.println("zero");
        } else if (myNumber < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    //  ======== 2: SPEED CONVERTER ========
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    //  ======== 3: MEGABYTE CONVERTER ========
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    //  ======== 4: BARKING DOG ========
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 && barking) {
            return true;
        } else if (hourOfDay > 22 && barking) {
            return true;
        } else {
            return false;
        }

    }

    //  ======== 5: LAP YEAR CALCULATOR ========
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999){
            return false;
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //  ======== 6: DECIMAL COMPARATOR ========
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        int checkNum1 = (int)(num1 * 1000);
        int checkNum2 = (int)(num2 * 1000);
        return checkNum1 - checkNum2 == 0;
    }

    //  ======== 7: EQUAL SUM CHECKER ========
    public static boolean hasEqualSum (int num1, int num2, int num3){
        int numTotal = num1 + num2;
        return numTotal == num3;
    }
}
