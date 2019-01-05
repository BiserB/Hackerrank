package intro;

import java.util.Scanner;

public class JavaLoops_1 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            sb.append(String.format("%d x %d = %d", num, i, num * i));
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString().trim());

        scanner.close();
    }
}
