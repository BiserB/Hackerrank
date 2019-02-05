package advanced;

public class JavaSingleton {

    private static JavaSingleton instance;
    public String str;

    private JavaSingleton() {
    }

    public static JavaSingleton getSingleInstance(){

        if (instance == null){
            instance = new JavaSingleton();
        }

        return instance;
    }
}
