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

            int[] input = new int[size];

            String[] numbers = reader.readLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                input[i] = Integer.parseInt(numbers[i]);
            }

            for (int i = 0; i < subSize; i++) {

                deque.addLast(input[i]);
            }

            maxUnique = findMaxUnique(deque);

            for (int i = subSize; i < size; i++) {

                int num = input[i];

                deque.removeFirst();
                deque.addLast(num);

                int currentUnique = findMaxUnique(deque);

                if (currentUnique > maxUnique){
                    maxUnique = currentUnique;
                }
            }
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        System.out.println(maxUnique);
    }

    private static int findMaxUnique(Deque<Integer> deque) {

        Set<Integer> set = new HashSet<>(deque);

        return set.size();
    }

}
