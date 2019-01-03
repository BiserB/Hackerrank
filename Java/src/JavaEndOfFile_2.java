import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaEndOfFile_2 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int counter = 1;
        String line;
        try{
            while ((line = reader.readLine()) != null){

                result.append(String.format("%d %s%s", counter, line, System.lineSeparator()));

                counter++;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(result.toString());
    }
}
