package intro;// You must read  integers from stdin and then print them to stdout.
// Each integer must be printed on a new line.

import java.io.*;

public class JavaStdinStdoutBufferedReader {

    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {

            String line = reader.readLine();

            writer.write(line);
            writer.newLine();
        }
        writer.flush();
    }
}
