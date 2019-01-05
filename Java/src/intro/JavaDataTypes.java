package intro;

import java.io.*;

public class JavaDataTypes {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int LONG_NUMBER_MAX_LENGTH = 19;
    private static String WRONG_TYPE = " can't be fitted anywhere.";
    private static String FITTED = " can be fitted in:";
    private static String BYTE = "* byte";
    private static String SHORT = "* short";
    private static String INT = "* int";
    private static String LONG = "* long";
    private static String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        int cnt = Integer.parseInt(reader.readLine());

        for (int i = 0; i < cnt; i++) {

            String line = reader.readLine();

            if (line.length() <= LONG_NUMBER_MAX_LENGTH) {

                Long number = 0L;

                try {
                    number = Long.parseLong(line);
                } catch (NumberFormatException numFormatEx) {
                    writer.write(line + WRONG_TYPE + NEW_LINE);
                }

                writer.write(line + FITTED + NEW_LINE);

                if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE) {
                    writer.write(BYTE + NEW_LINE);
                }
                if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE) {
                    writer.write(SHORT + NEW_LINE);
                }
                if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
                    writer.write(INT + NEW_LINE);
                }

                writer.write(LONG + NEW_LINE);
            } else {
                writer.write(line + WRONG_TYPE + NEW_LINE);
            }
        }

        writer.flush();
    }
}
