import java.util.ArrayList;
import java.util.Scanner;

class Subject {
    String name;
    int mark;

    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }


    public String toString() {

        return name + ": " + mark;
    }
}

class Student
{
    String name;
    int rollno;
    Subject[] subjects;

    public Student(String name, int rollno, Scanner sc) {
        this.name = name;
        this.rollno = rollno;
        this.subjects = new Subject[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of subject " + (i + 1) + ":");
            String subjectName = sc.next();

            System.out.println("Enter mark for " + subjectName + ":");
            int mark = sc.nextInt();

            subjects[i] = new Subject(subjectName, mark);
        }
    }


    public String toString() {
        return "Student Name: " + name + ", Roll No: " + rollno;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int nstudents = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < nstudents; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.next();

            System.out.println("Enter roll number of " + name + ":");
            int rollno = sc.nextInt();

            Student student = new Student(name, rollno, sc);
            students.add(student);
        }

        double totalMarks = 0;
        for (Student student : students) {
            double avg = calculateAverage(student);
            totalMarks += avg;
            System.out.println(student + ", Average Marks: " + avg);
        }

        double classAverage = totalMarks / students.size();
        System.out.println("Class average: " + classAverage);
    }

    public static double calculateAverage(Student student) {
        int total = 0;
        for (Subject subject : student.subjects) {
            total += subject.mark;
        }
        return total / 5.0;
    }
}
