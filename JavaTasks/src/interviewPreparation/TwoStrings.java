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


        for (int start = 0, end = 1; start <= s1.length() - end; start++, end++) {

            String subString = s1.substring(start, end);

            if (s2.contains(subString)){

                return "YES";
            }
        }

        return "NO";
    }


}
