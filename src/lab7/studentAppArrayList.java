package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you do have?: ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        myList = inputData(myList,val);
        showData(myList);
    }//main

    private static void showData(ArrayList<Student> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Name: "+myList.get(i).getName());
            System.out.println("Age: "+myList.get(i).getAge());
            System.out.println("Gender: "+myList.get(i).getGender());
            System.out.println("Height: "+myList.get(i).getHeight());
        }
    }

    private static ArrayList inputData(ArrayList<Student> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++){
            Student s = new Student();
        System.out.println("Enter student info "+i+" : ");
        System.out.println("Please enter your information: ");
        System.out.print("Name: ");
        s.setName(reader.readLine());
        System.out.print("Age: ");
        s.setAge(Integer.parseInt(reader.readLine()));
        System.out.print("Gender: ");
        s.setGender(reader.readLine());
        System.out.print("Height: ");
        s.setHeight(Double.parseDouble(reader.readLine()));

        myList.add(s);
    }
    return myList;
    }

}//class
