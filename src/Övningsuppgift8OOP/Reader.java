package Övningsuppgift8OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Reader {

    public static ArrayList<String> temperatures(){

        String tempLine;
        ArrayList<String> temperatures = new ArrayList<>();
        try{
            BufferedReader bufIn = new BufferedReader(new FileReader("resources/Temp.txt"));
            while((tempLine = bufIn.readLine()) != null){

                temperatures.add(tempLine);
            }

        }
        catch(Exception e){
            System.out.println("File not found");
        }
        return temperatures;
    }


    public static ArrayList<Double> sortList(ArrayList<String> list){

        ArrayList<Double> sortedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i).replaceAll("," , ".");
            list.set(i, temp);
            sortedList.add(Double.parseDouble(list.get(i)));
        }
        Collections.sort(sortedList);

        return sortedList;
    }

}
