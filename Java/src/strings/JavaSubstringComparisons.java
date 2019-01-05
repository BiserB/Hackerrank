package strings;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int subSize = scanner.nextInt();

        scanner.close();

        System.out.println(getSmallestAndLargestWithSet(str, subSize));
    }

    public static String getSmallestAndLargest(String str, int subSize) {

        String smallest = str.substring(0, subSize);
        String largest = str.substring(0, subSize);

        for (int i = 1; i <= str.length() - subSize; i++) {

            String currentSubstring = str.substring(i, i + subSize);
            if (currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }
        }

        return smallest + System.lineSeparator() + largest;
    }

    public static String getSmallestAndLargestWithSet(String str, int subSize) {

        TreeSet<String> ordered = new TreeSet<String>();

        for (int i = 0; i <= str.length() - subSize; i++) {

            String currentSubstring = str.substring(i, i + subSize);

            ordered.add(currentSubstring);
        }

        return ordered.first() + System.lineSeparator() + ordered.last();
    }
}
