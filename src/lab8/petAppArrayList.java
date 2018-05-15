package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class petAppArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data Pet do have? ");
        int val = Integer.parseInt(reader.readLine());
        ArrayList<Pet> myList = new ArrayList<>();
        myList = inputData(myList,val);
        showData(myList);
    }//main

    private static void showData(ArrayList<Pet> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Name: "+myList.get(i).getName());
            System.out.println("Age: "+myList.get(i).getAge());
        }
    }

    private static ArrayList<Pet> inputData(ArrayList<Pet> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= val; i++) {
            Pet p = new Pet() {
                @Override
                public void makeNoise() {
                    System.out.println("Box Box !!!");
                }
            };
            System.out.println("Enter Pet info "+i+" : ");
            System.out.println("Please enter your information: ");
            System.out.print("Name: ");
            p.setName(reader.readLine());
            System.out.print("Age: ");
            p.setAge(Integer.parseInt(reader.readLine()));

            myList.add(p);
        }
        return myList;
        }
    }//class