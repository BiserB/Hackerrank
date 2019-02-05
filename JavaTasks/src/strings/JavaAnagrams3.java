package strings;

import java.util.Scanner;

public class JavaAnagrams3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        scan.close();

        String result = isAnagram(first, second)? "Anagrams" : "Not Anagrams";

        System.out.println(result);
    }

    private static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()){
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < first.length(); i++) {

            int code = Character.codePointAt(first, i);

            if(65 <= code && code <= 90){
                code += 32;
            }
            code -= 97;

            alphabet[code]++;
        }

        for (int i = 0; i < second.length(); i++) {

            int code = Character.codePointAt(second, i);

            if(65 <= code && code <= 90){
                code += 32;
            }
            code -= 97;

            alphabet[code]--;
        }

        for (int i:alphabet) {
            if(i != 0){
                return false;
            }
        }

        return true;
    }

}
