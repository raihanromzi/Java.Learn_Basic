public class Operator {
    public static void main (String[] args) {
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
        System.out.println(result);

        result--; // result = result - 1 = 4 - 1
        System.out.println(result);

        result +=2; //result = result + 2 = 3 + 2
        System.out.println(result);

        result *= 10; //result = result * 10 = 5 * 10
        System.out.println(result);

        result /= 10; //result = result / 10 = 50 / 10 = 5
        System.out.println(result);

        result -= 2; //result = result - 2 = 5 - 2 = 3
        System.out.println(result);
    }
}
