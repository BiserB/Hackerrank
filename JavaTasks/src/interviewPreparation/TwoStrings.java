package interviewPreparation;

import java.util.Scanner;

public class TwoStrings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int countOfCouples = scanner.nextInt();

        for(int i = 0; i < countOfCouples; i++){

            String str1 = scanner.next();
            String str2 = scanner.next();

            String result = Compare(str1, str2);

            System.out.println(result);
        }

    }

    private static String Compare(String s1, String s2){

       String possibleLetters = "abcdefghijlkmnopqrstuvwxyz";

        for(int i = 0; i < possibleLetters.length(); i++){

            String currentLetter = Character.toString(possibleLetters.charAt(i));
            boolean s1HasLetter = s1.contains(currentLetter);
            boolean s2HasLetter = s2.contains(currentLetter);

            if(s1HasLetter && s2HasLetter){

                return "YES";
            }
        }

        return "NO";
    }

}
