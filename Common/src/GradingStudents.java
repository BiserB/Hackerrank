import java.io.*;

public class GradingStudents {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args)throws IOException {

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {

            int grade = Integer.parseInt(reader.readLine());

            if(grade >= 38){

                int divident = grade / 5;
                int nextMultiple = (divident + 1) * 5;

                if(nextMultiple - grade < 3){
                    grade = nextMultiple;
                }
            }

            writer.write(grade + "\n");
        }

        writer.flush();
    }
}
