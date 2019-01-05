import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (num % 2 != 0 || (num >= 6 && num <= 20)){

            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}
