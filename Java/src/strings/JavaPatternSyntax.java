package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        while(testCases > 0){

            String pattern = scanner.nextLine();

            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException pse){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
