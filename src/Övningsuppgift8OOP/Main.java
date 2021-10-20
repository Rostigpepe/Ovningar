package Övningsuppgift8OOP;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> list = Reader.sortList(Reader.temperatures());

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("The average temperature has been: " + sum/list.size());

    }

}
