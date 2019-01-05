package strings;

import java.util.Scanner;

public class JavaStringsIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();
        scanner.close();

        int lengthSum = first.length() + second.length();

        int comparision = first.compareTo(second);

        String comparisionResult = comparision <= 0 ? "No" : "Yes" ;

        String resultStr = String.format("%s %s", capitalize(first), capitalize(second));

        System.out.println(lengthSum);
        System.out.println(comparisionResult);
        System.out.println(resultStr);
    }


    private static String capitalize(String word){
        if (word == null || word.isEmpty()){
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}
