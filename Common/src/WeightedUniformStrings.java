import java.io.*;
import java.util.HashSet;

public class WeightedUniformStrings {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    private static HashSet<Integer> weights = new HashSet<>();
    private static int[] queries;

    public static void main(String[] args)throws IOException {

        char[] input = reader.readLine().toCharArray();
        int queriesCount = Integer.parseInt(reader.readLine());

        queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {

            queries[i] = Integer.parseInt(reader.readLine());
        }

        int count = 1;
        char prevChar = input[0];
        int weight = (prevChar - 96) * count;

        weights.add(weight);

        for (int i = 1; i < input.length; i++) {

            char currentChar = input[i];

            if (prevChar == currentChar){
                count++;
            }
            else{
                count = 1;
            }

            weight = (currentChar - 96) * count;

            weights.add(weight);
            prevChar = currentChar;
        }

        for (int query:queries ) {
            if (weights.contains(query)){
                writer.write("Yes\n");
            }
            else{
                writer.write("No\n");
            }
        }

        writer.flush();
    }

}
