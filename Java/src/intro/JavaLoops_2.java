package intro;

import java.util.Scanner;

public class JavaLoops_2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        int cnt = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cnt; i++) {

            String[] numbers = scanner.nextLine().split(" ");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int n = Integer.parseInt(numbers[2]);

            if (n == 0){
                System.out.println(0);
                return;
            }

            double previousElement = a + b;
            sb.append(String.format("%.0f ", previousElement));

            for (double j = 1; j < n; j++) {

                double result = previousElement + Math.pow(2, j) * b;
                sb.append(String.format("%.0f ", result));
                previousElement = result;
            }

            System.out.println(sb.toString().trim());
            sb.setLength(0);
        }

    }
}
