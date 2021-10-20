package Övningsuppgift3aOOP;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Kurs mainCourse = new Kurs("1", "Coding");


        for (int i = 0; i < 50; i++) {

            int int1 = random.nextInt(99999) + 10000;
            int int2 = random.nextInt(99999) + 10000;
            int int3 = random.nextInt(99999) + 10000;

            String name = String.valueOf(int1);
            String ssn = String.valueOf(int2);
            String ID = String.valueOf(int3);

            Student student = new Student(name, ssn, ID);
            mainCourse.addStudent(student);

        }

        for (int i = 0; i < 4; i++) {

            int int1 = random.nextInt(99999) + 10000;
            int int2 = random.nextInt(99999) + 10000;
            int int3 = random.nextInt(99999) + 10000;

            String name = String.valueOf(int1);
            String ssn = String.valueOf(int2);
            String ID = String.valueOf(int3);

            Lärare teacher = new Lärare(name, ssn, ID);
            mainCourse.addTeacher(teacher);

        }

        mainCourse.printInfo();




    }

}
