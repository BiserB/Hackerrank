package strings;

import java.util.Scanner;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        scan.close();

        String result = isAnagram(first, second)? "Anagrams" : "Not Anagrams";

        System.out.println(result);
    }

    private static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()){
            return false;
        }

        char[] firstChars = a.toLowerCase().toCharArray();
        char[] secondChars = b.toLowerCase().toCharArray();

        for (char ch: firstChars) {
            int charFirstCount = getCharacterCount(ch, firstChars);
            int charSecondCount = getCharacterCount(ch, secondChars);
            if (charFirstCount != charSecondCount){
                return false;
            }
        }

        return true;
    }

    private static int getCharacterCount(char ch, char[] characters){
        int count = 0;

        for (char c:characters ) {
            if(c == ch){
                count++;
            }
        }
        return count;
    }
}
