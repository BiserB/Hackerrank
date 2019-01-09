package bigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        BigInteger number = new BigInteger(line);

        boolean isPrime = number.isProbablePrime(1);

        if (isPrime){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
