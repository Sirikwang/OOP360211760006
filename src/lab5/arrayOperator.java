package lab5;
//1.Method for input data
//2.Method for show data
//3.Method for find average value from array
//4.Method for find maximum value
//5.Method for find minimum value

import java.util.Scanner;

public class arrayOperator {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int myArray[] = new int[MAX];
        myArray = inputData(myArray);
        showData(myArray);
        //find average
        findAverage(myArray);
        findMax(myArray);
        findMin(myArray);

    }//main

    private static void findMin(int[] myArray) {
        int min = myArray[0];
        for(int i=0; i > myArray.length; i++){
            if (min >= myArray[i])
                min = myArray[i];
        }

        System.out.println("The minimum value is " +min);
    }

    private static void findMax(int[] myArray) {
        int max = myArray[0];
        for (int i=0; i < myArray.length; i++){
            if (max <= myArray[i])
                max = myArray[i];
        }
        System.out.println("The maximum value is " +max);
    }

    private static void findAverage(int[] myArray) {
        int total = 0;
        for (int val:myArray)
        total += val;
        System.out.println("\nThe average value is " +(total/MAX));

    }

    private static void showData(int[] myArray) {
        System.out.println("Data in array");
        for(int val:myArray)
            System.out.print(val+"\t");
    }

    private static int[] inputData(int[] myArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter integers: ");
        for (int i=0;i < myArray.length; i++){
            System.out.print("integer "+i+" : ");
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
}//class
