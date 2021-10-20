package Övningsuppgift3aOOP;

public class Lärare extends Person{

    private Kurs[] heldCourses = new Kurs[1];

    private String teacherId;

    Lärare(String name, String ssn, String ID){
        super(name, ssn);

        this.teacherId = ID;

    }

    public void addCourse(Kurs course){

        int i = heldCourses.length;
        heldCourses[i] = course;

    }


}
