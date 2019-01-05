package intro;// You must read  integers from stdin and then print them to stdout.
// Each integer must be printed on a new line.

import java.util.Scanner;

public class JavaStdinStdout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            String line = scanner.nextLine();

            System.out.println(line);
        }

    }
}
