package oop;

import java.util.Scanner;

abstract class Book{

    String title;

    String getTitle(){
        return this.title;
    }

    abstract void setTitle(String title);
}

class MyBook extends Book{

    @Override
    void setTitle(String title) {
        this.title = title;
    }
}

public class JavaAbstractClass{

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();

        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);

        System.out.println("The title is: "+ new_novel.getTitle());
        sc.close();
    }
}