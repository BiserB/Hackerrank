package strings;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.close();


        String span = str.substring(start, end);

        System.out.println(span);
    }
}
