package strings;

import java.lang.reflect.Array;
import java.util.*;

public class JavaAnagrams2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        scan.close();

        String result = isAnagram(first, second)? "Anagrams" : "Not Anagrams";

        System.out.println(result);
    }

    private static boolean isAnagram(String a, String b) {

        ArrayList<Character> firstChars = new ArrayList<>();
        ArrayList<Character> secondChars = new ArrayList<>();

        for (char ch:a.toLowerCase().toCharArray()) {
            firstChars.add(ch);
        }

        for (char ch:b.toLowerCase().toCharArray()) {
            secondChars.add(ch);
        }

        Collections.sort(firstChars);
        Collections.sort(secondChars);

        return firstChars.equals(secondChars);
    }

}
