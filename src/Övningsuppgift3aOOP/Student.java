package Övningsuppgift3aOOP;

public class Student extends Person{

    private Kurs[] takenCourses = new Kurs[1];

    private String studentId;

    Student(String name, String ssn, String ID) {
        super(name, ssn);

        this.studentId = ID;

    }

    public void addCourse(Kurs course){

        int i = takenCourses.length;
        takenCourses[i] = course;

    }

}
