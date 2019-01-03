import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while(scanner.hasNext()){
            counter++;
            String line = scanner.nextLine();
            String resultLine = String.format("%d %s", counter, line);

            System.out.println(resultLine);
        }
    }
}
