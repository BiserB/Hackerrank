package dataStructures;

import java.util.Scanner;

public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int[][] matrix = new int[6][6];
    private static int biggestSum = Integer.MIN_VALUE;

    public static void main(String[] args) {

        populateMatrix();

        traverseMatrix();

        System.out.println(biggestSum);
    }

    private static void populateMatrix(){

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                matrix[i][j] = arrItem;
            }
        }
        scanner.close();
    }

    private static void traverseMatrix(){
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

                int sum = getSum(row, col);

                if (sum > biggestSum){
                    biggestSum = sum;
                }
            }
        }
    }

    private static int getSum(int row, int col) {

        int sum = matrix[row][col] + matrix[row][col+ 1] + matrix[row][col + 2];
        sum += matrix[row + 1][col + 1] ;
        sum += matrix[row + 2][col] + matrix[row + 2][col + 1]+ matrix[row + 2][col + 2] ;

        return sum;
    }

}
