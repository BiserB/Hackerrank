import java.io.*;

public class AppleOrange {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args)throws IOException {

        String[] line1 = reader.readLine().split(" ");
        String[] line2 = reader.readLine().split(" ");
        String[] line3 = reader.readLine().split(" ");
        String[] line4 = reader.readLine().split(" ");
        String[] line5 = reader.readLine().split(" ");


        int houseStart = Integer.parseInt(line1[0]);
        int houseEnd = Integer.parseInt(line1[1]);

        int appleTree = Integer.parseInt(line2[0]);
        int orangeTree = Integer.parseInt(line2[1]);

        int m = Integer.parseInt(line3[0]);
        int n = Integer.parseInt(line3[1]);

        int[] appleDistances = new int[m];
        int[] orangeDistances = new int[n];

        for (int i = 0; i < m; i++) {

            appleDistances[i] = Integer.parseInt(line4[i]);
        }

        for (int i = 0; i < n; i++) {

            orangeDistances[i] = Integer.parseInt(line5[i]);
        }

        int applesInside = 0;

        for (int i = 0; i < appleDistances.length; i++) {

            int applePostion = appleTree + appleDistances[i];

            if (applePostion >= houseStart && applePostion <= houseEnd){
                applesInside++;
            }
        }

        int orangesInside = 0;

        for (int i = 0; i < orangeDistances.length; i++) {

            int orangePosition = orangeTree + orangeDistances[i];

            if (orangePosition >= houseStart && orangePosition <= houseEnd){
                orangesInside++;
            }
        }

        writer.write(applesInside + "\n");
        writer.write(orangesInside + "\n");
        writer.flush();
    }
}
