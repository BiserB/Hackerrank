package intro;

import java.io.*;
import java.text.*;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day, 0, 0, 0);

        int weekday = cal.get(Calendar.DAY_OF_WEEK);

        DateFormatSymbols dfs = new DateFormatSymbols();

        return dfs.getWeekdays()[weekday].toUpperCase();
    }
}

public class JavaCalendar {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static class Test{

    }
}
