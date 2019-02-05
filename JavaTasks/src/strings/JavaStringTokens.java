package strings;

import java.util.Scanner;
import java.util.stream.Stream;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String[] splitted = str.split("[\\!\\,\\?\\.\\_\\'\\@\\s]");

        String[] result = Stream.of(splitted)
                                .filter(s -> !s.isEmpty())
                                .toArray(String[]::new);

        System.out.println(result.length);

        for (String s: result) {
            System.out.println(s);
        }
    }
}
