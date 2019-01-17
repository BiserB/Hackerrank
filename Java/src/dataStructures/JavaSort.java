package dataStructures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {

        if (this.cgpa < student.getCgpa()){
            return 1;
        }
        else if (this.cgpa > student.getCgpa()){
            return -1;
        }
        else if (this.fname.compareTo(student.getFname()) != 0){
            return this.fname.compareTo(student.getFname());
        }
        else {
            if (this.id < student.id){
                return -1;
            }
            else {
                return 1;
            }
        }
    }
}

public class JavaSort
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while(testCases>0){

            int id = scan.nextInt();
            String fname = scan.next();
            double cgpa = scan.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
