package intro;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String str = scanner.next();

            int x = scanner.nextInt();

            System.out.format("%-15.15s%03d" , str, x);
            System.out.println();
        }
        System.out.println("================================");

    }
}
