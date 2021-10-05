public class Exercise {
    // CONSTANTA -> Using capital language for identifier
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";


    public static void main(String[] args) {
        System.out.println("============== OUTPUT START HERE ==============");

        checkNumber(10);

        printConversion(1.0);

        printMegaBytesAndKiloBytes(1024);

        boolean testBarking = shouldWakeUp(false, 2);
        System.out.println(testBarking);

        boolean testLeapYear = isLeapYear(1800);
        System.out.println(testLeapYear);

        boolean testEqual = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(testEqual);

        boolean testSumChecker = hasEqualSum(1, 1, 2);
        System.out.println(testSumChecker);

        boolean testIsTeen = hasTeen(19, 20, 2);
        System.out.println(testIsTeen);

        System.out.println(getDurationString(100, 50));
        System.out.println(getDurationString(3945));


        printYearsAndDays(1440);

        printDayOfTheWeek(3);

        printNumberInWord(3);

        System.out.println(getDaysInMonth(1, 2020));

        System.out.println(sumDigits(125));

        System.out.println(isPalindrome(-101));

        System.out.println(sumFirstAndLastDigit(101));

        System.out.println(getEvenDigitSum(123456789));

        System.out.println(hasSharedDigit(13,43));



        System.out.println("============== OUTPUT END HERE ==============");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //  ======== 1: PRIMITIVE TYPE CHALLENGE ========
        byte byteNum = 10;
        short shortNum = 20;
        int intNum = 50;
        long totalNumLong = (50_000L + (10L * (byteNum + shortNum + intNum)));
        short totalNumShort = (short) (1000 + 10 * (byteNum + shortNum + intNum));

        System.out.println("Result = " + totalNumLong);
        System.out.println("Result = " + totalNumShort);

        double poundValue = 2d;
        double kilogramValue = 0.45359237d;
        System.out.println("KG to Pound = " + poundValue * kilogramValue);

        //  ======== 2: IF-ELSE CHALLENGE ========
        //  CHALLENGE
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score was " + finalScore);
        }

        //  ======== 18: SUM 3 & 5 CHALLENGE ========
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                sum = sum + i;

                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Total num : " + count);
        System.out.println("Total sum num : " + sum);

        System.out.println(sumOdd(1,100));

    }

    //  ======== 3: CHECK POSITIVE NEGATIVE ZERO NUMBER ========
    public static void checkNumber(int myNumber) {
        if (myNumber == 0) {
            System.out.println("zero");
        } else if (myNumber < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }

    //  ======== 4: SPEED CONVERTER ========
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

    //  ======== 5: MEGABYTE CONVERTER ========
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    //  ======== 6: BARKING DOG ========
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

    //  ======== 7: LAP YEAR CALCULATOR ========
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //  ======== 8: DECIMAL COMPARATOR ========
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int checkNum1 = (int) (num1 * 1000);
        int checkNum2 = (int) (num2 * 1000);
        return checkNum1 - checkNum2 == 0;
    }

    //  ======== 9: EQUAL SUM CHECKER ========
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int numTotal = num1 + num2;
        return numTotal == num3;
    }

    //  ======== 10: TEEN NUMBER CHECKER ========
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num1) {
        return (num1 <= 19 && num1 >= 13);
    }

    //  ======== 11: SECOND AND MINUTES CHALLENGE ========

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes / 60;
        int minute = minutes % 60;

        return hour + "h " + minute + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }

    //  ======== 12: AREA CALCULATOR ========
    public static double area(double radius) {
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        return (x < 0 && y < 0) ? -1 : x * y;
    }

    //  ======== 13: MINUTES TO YEAR AND DAYS ========
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long day = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

    //  ======== 14: EQUALITY PRINTER ========
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        // Alternative Solution :
        //System.out.println((x < 0 || y < 0 || z < 0) ? "Invalid Value" : (x == y && x == z) ? "All numbers are equal" :
        //(x != y && x != z && y != z) ? "All numbers are different" : "Neither all are equal or different");

    }

    //  ======== 15: PLAYING CAT ========
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }

    //  ======== 16: PRINT DAY OF THE WEEK ========
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    //  ======== 16: PRINT DAY OF THE WEEK ========
    public static void printNumberInWord(int num) {
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    //  ======== 17: NUMBER OF DAY IN MONTH ========
    public static boolean isLeapYear2(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 00) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeapYear2(year)) {
            switch (month) {
                case 11:
                case 4:
                case 6:
                case 9:
                    return 30;
                case 2:
                    return 29;
                default:
                    return 31;
            }
        } else {
            switch (month) {
                case 11:
                case 4:
                case 6:
                case 9:
                    return 30;
                case 2:
                    return 28;
                default:
                    return 31;
            }
        }
    }

    //  ======== 19: SUM ODD ========

    public static boolean isOdd(int number) {
        if(number < 0){
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if(end < start || end < 0 || start < 0){
            return -1;
        }

        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum = sum + i;
            }
        }
        return sum;
    }

    //  ======== 20: DIGIT SUM ========
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int tmp = number % 10;
            sum += tmp;
            number /= 10;
        }
        return sum;
    }

    //  ======== 21: NUMBER PALINDROME ========
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int origin = number;

        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse == origin;
    }

    //  ======== 22: FIRST AND LAST DIGIT SUM ========
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 9){
            number /= 10;
        }
        return number + lastDigit;
    }

    //  ======== 23: EVEN DIGIT SUM ========
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            return -1;
        } else {
            while(number > 0) {
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number /= 10;
            }
        }
        return sum;
    }

    //  ======== 24: SHARE DIGIT ========
    public static boolean hasSharedDigit( int x, int y) {
        if((x < 10) || (x >99) || (y < 10) || (y >99)) {
            return false;
        } else {
            int lastDigitOfX = x % 10;
            int firstDigitOfX = x / 10;
            int lastDigitOfY = y % 10;
            int firstDigitOfY = y / 10;
            return (lastDigitOfX == lastDigitOfY) || (firstDigitOfX == firstDigitOfY) ||
                    (lastDigitOfX == firstDigitOfY) || (firstDigitOfX == lastDigitOfY);
        }
    }

    //  ======== 25: LAST DIGIT CHECKER ========

}
