package advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    private String id;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

public class JavaReflection {

    public static void main(String[] args){

        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();

        for(Method m: methods){
            methodList.add(m.getName());
        }

        Collections.sort(methodList);

        for(String name: methodList){
            System.out.println(name);
        }
    }

}