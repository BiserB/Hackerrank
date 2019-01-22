package dataStructures.priority;


import java.util.*;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities{

    public List<Student> getStudents(List<String> events) {

        List<Student> result = new ArrayList<>();

        boolean needsSorting = false;

        for (int i = 0; i < events.size(); i++) {

            String[] data = events.get(i).split(" ");

            String command = data[0];

            if (command.equals("ENTER")){
                String name = data[1];
                Double cgpa = Double.parseDouble(data[2]);
                int id = Integer.parseInt(data[3]);

                Student newStudent = new Student(id, name, cgpa);

                result.add(newStudent);
                needsSorting = true;
            }
            else if(command.equals("SERVED") && !result.isEmpty()){

                if (needsSorting){
                    result.sort(new MyComparator());
                    needsSorting = false;
                }

                result.remove(result.size() - 1);
            }

        }

        Collections.reverse(result);

        return result;
    }
}

class MyComparator implements Comparator<Student> {

    public int compare(Student st1, Student st2){

        int result = 0;

        result = st1.getCgpa().compareTo(st2.getCgpa());

        if (result == 0){
            result = st2.getName().compareTo(st1.getName());
        }

        if (result == 0){
            result = st2.getId() - st1.getId();
        }

        return result;
    }
}

class Student{

    private int id;
    private String name;
    private Double cgpa;

    public Student(int id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public Double getCgpa() {
        return this.cgpa;
    }

    public String getName() {
        return this.name;
    }
}

