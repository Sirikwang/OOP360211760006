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
        System.out.println("My Pets data show below : ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Name: "+myList.get(i).getName());
            System.out.println("Age: "+myList.get(i).getAge());


        }
    }

    private static ArrayList<Pet> inputData(ArrayList<Pet> myList, int val) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter you pets info. ");
        for (int i = 1; i <= val; i++) {
            Pet p = new Pet() {
                @Override
                public void makeNoise() {
                }
            };
            System.out.print("Pet: " + i + ". ");
            System.out.print("if it is a Dog type 1 or Cat type other. : ");
            int t = Integer.parseInt(reader.readLine());
            if (i <= 1) {
                System.out.print("Dog Name: ");
                p.setName(reader.readLine());
                System.out.print("Dog Age: ");
                p.setAge(Integer.parseInt(reader.readLine()));
            } else {
                System.out.print("Cat Name: ");
                p.setName(reader.readLine());
                System.out.print("Cat Age: ");
                p.setAge(Integer.parseInt(reader.readLine()));
            }
                myList.add(p);

        }
        return myList;
        }
    }//class