package intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en","IN");

        NumberFormat numFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numFormatIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat numFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = numFormatUS.format(payment);
        String india = numFormatIndia.format(payment);
        String ch = numFormatChina.format(payment);
        String fr = numFormatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
