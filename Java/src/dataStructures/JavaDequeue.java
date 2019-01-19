package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JavaDequeue {

    public static void main(String[] args)  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxUnique = 0;

        try{
            String[] line = reader.readLine().split(" ");

            int size = Integer.parseInt(line[0]);
            int subSize = Integer.parseInt(line[1]);

            Deque<Integer> deque = new ArrayDeque<>(subSize);

            int[] allNumbers = new int[size];

            String[] input = reader.readLine().split(" ");

            for (int i = 0; i < allNumbers.length; i++) {
                allNumbers[i] = Integer.parseInt(input[i]);
            }

            for (int i = 0; i < subSize; i++) {

                deque.addLast(allNumbers[i]);
            }

            Set<Integer> uniques = new HashSet<>(deque);

            maxUnique = uniques.size();

            for (int i = subSize; i < size; i++) {

                int num = allNumbers[i];

                int first = deque.removeFirst();

                deque.addLast(num);
                uniques.add(num);

                if (!deque.contains(first)){
                    uniques.remove(first);
                }

                int currentUnique = uniques.size();

                if (currentUnique > maxUnique){
                    maxUnique = currentUnique;
                }
            }

            System.out.println(maxUnique);
        }
        catch (IOException ioe){

            System.out.println(ioe.getMessage());
        }
    }
}
