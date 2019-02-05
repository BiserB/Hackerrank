package strings;

import java.util.Scanner;

public class JavaPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String original = scanner.next();

        scanner.close();

        StringBuffer sb = new StringBuffer(original);

        String reversed = sb.reverse().toString();

        String isPalindrome = reversed.equals(original)? "Yes" : "No";

        System.out.println(isPalindrome);
    }
}
