package dataStructures;

import java.util.Scanner;

public class Java1DArray2 {

    private static boolean canWin(int index, int leap, int[]game){

        if (index < 0 || game[index] != 0){
            return false;
        }

        if(index + 1 >= game.length || index + leap >= game.length){
            return true;
        }

        game[index] = 1;

        return canWin(index + 1, leap, game) || canWin(index + leap, leap, game) || canWin(index - 1, leap, game);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(0, leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
