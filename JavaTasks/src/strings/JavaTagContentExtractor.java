package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaTagContentExtractor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String regex = "<(\\w+)>([^<]+)<\\/\\1>";

        Pattern p = Pattern.compile(regex);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases-- > 0){

            String line = in.nextLine();

            Matcher m = p.matcher(line);

            boolean found = false;

            while (m.find()) {
                found = true;
                System.out.println(m.group(2));
            }

            if (!found){
                System.out.println("None");
            }
        }
    }
}
