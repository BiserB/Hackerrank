package dataStructures;

import java.util.Scanner;

public class JavaSubarrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {

            numbers[i] = scan.nextInt();
        }

        int negativeSubarrays = 0;

        for (int i = 0; i < count; i++) {

            int sum = 0;

            for (int j = i; j < count; j++) {

                sum += numbers[j];
                if (sum < 0){
                    negativeSubarrays++;
                }
            }
        }

        System.out.println(negativeSubarrays);
    }
}
