package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        List<Integer> list = new ArrayList<>(count);

        while (count > 0) {

            int num = scan.nextInt();

            list.add(num);

            count --;
        }

        int queries = scan.nextInt();

        while (queries > 0) {

            String command = scan.next();

            if (command.equals("Insert")){

                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            }
            else if(command.equals("Delete")){

                int index = scan.nextInt();
                list.remove(index);
            }

            queries --;
        }

        scan.close();
        list.forEach(n -> System.out.print(n + " ") );
    }
}
