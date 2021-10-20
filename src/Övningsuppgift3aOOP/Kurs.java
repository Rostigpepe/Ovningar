package Övningsuppgift3aOOP;

import java.util.ArrayList;

public class Kurs {

    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Lärare> teachers = new ArrayList();

    private String courseId;
    private String subject;

    Kurs(String ID, String subject){

        this.courseId = ID;
        this.subject = subject;

    }


    public void addStudent(Student student){

        students.add(student);
    }

    public void addTeacher(Lärare teacher){

        teachers.add(teacher);
    }

    public void printInfo(){

        System.out.println("Name: " + subject);
        System.out.print("Teachers: ");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.print(teachers.get(i).getName() + ",   ");
        }
        System.out.print("\n");

        System.out.println("Students: ");
        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).getName());

        }


    }


}
