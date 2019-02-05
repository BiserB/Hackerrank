package bigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

class JavaBigDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        sc.close();

        List<BigDecimal> decimals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            decimals.add(new BigDecimal(s[i]));
        }

        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < decimals.size() - 1; i++) {

                BigDecimal leftDecimal = decimals.get(i);
                BigDecimal rightDecimal = decimals.get(i + 1);

                if (leftDecimal.compareTo(rightDecimal) < 0) {

                    BigDecimal temp = rightDecimal;
                    decimals.set(i + 1, leftDecimal);
                    decimals.set(i, temp);
                    swapped = true;

                    String tempString = s[i + 1];
                    s[i + 1] = s[i];
                    s[i] = tempString;
                }
            }
        }
        while (swapped);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}