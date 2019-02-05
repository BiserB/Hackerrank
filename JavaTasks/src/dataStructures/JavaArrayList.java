package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        ArrayList<Integer>[] data = new ArrayList[num];

        for (int i = 0; i < num; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            int size = scanner.nextInt();

            for (int j = 0; j < size; j++) {
                row.add(scanner.nextInt());
            }

            data[i] = row;
        }

        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {

            int row = scanner.nextInt() - 1;
            int position = scanner.nextInt() - 1;

            if (row < 0 || row >= data.length || position < 0 || position >= data[row].size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(data[row].get(position));
            }

        }

    }
}
