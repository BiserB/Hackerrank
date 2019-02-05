package oop;

import java.util.Scanner;

public class JavaExceptionsTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{

            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());

            int result = x/y;

            System.out.println(result);
        }
        catch (NumberFormatException nfe){

            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException ae){

            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
