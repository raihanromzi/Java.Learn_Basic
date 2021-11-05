package data_structure.array;

import java.util.Locale;
import java.util.Scanner;

enum levels {
    LOW, MEDIUM, HIGH;
}

public class PlayArray {
    private static final String[] arrays = {"low", "Medium","High"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 0; i < arrays.length;i++){
            System.out.println(arrays[i]);
        }

        System.out.println(levels.HIGH);

        System.out.println("Input Level : ");
        String input = scanner.next().toUpperCase(Locale.ROOT);
        levels l = levels.valueOf(input);

        switch (l) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }

    }
}
