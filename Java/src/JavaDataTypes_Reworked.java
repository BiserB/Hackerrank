import java.io.*;
import java.util.Scanner;

public class JavaDataTypes_Reworked {

    private static Scanner scanner = new Scanner(System.in);

    private static String WRONG_TYPE = " can't be fitted anywhere.";
    private static String FITTED = " can be fitted in:";
    private static String BYTE = "* byte";
    private static String SHORT = "* short";
    private static String INT = "* int";
    private static String LONG = "* long";
    private static String NEW_LINE = "\n";

    public static void main(String[] args){

        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {

            try {
                long number = scanner.nextLong();

                System.out.println(number + FITTED);

                if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE) {
                    System.out.println(BYTE);
                }
                if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE) {
                    System.out.println(SHORT);
                }
                if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
                    System.out.println(INT);
                }
                System.out.println(LONG);

            } catch (Exception ex) {
                System.out.println(scanner.next() + WRONG_TYPE);
            }
        }
    }
}
