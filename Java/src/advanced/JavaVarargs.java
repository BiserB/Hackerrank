package advanced;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;


class Add {

    public void add(int... numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            if (i < numbers.length - 1){
                System.out.print(numbers[i] + "+");
            }
            else{
                System.out.print(numbers[i] + "=" + sum + System.lineSeparator());
            }
        }
    }
}

public class JavaVarargs {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add math = new Add();
            math.add(n1,n2);
            math.add(n1,n2,n3);
            math.add(n1,n2,n3,n4,n5);
            math.add(n1,n2,n3,n4,n5,n6);

            Method[] methods=Add.class.getDeclaredMethods();

            Set<String> set=new HashSet<>();

            boolean overload=false;

            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

