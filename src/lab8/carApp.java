package lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carApp {
    public static void main(String[] args) throws IOException {

        Engine e = new Engine();
        e.setEngSize(2500);
        e.setHorsePower(150);

        //ceate car object

        Car c = new Car();
        c.setColor("Red");
        c.setBrand("Honda");
        c.setCarID("กข-1234");
        c.setEngine(e);

        System.out.println(c.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter car color: ");
        String color = reader.readLine();
        System.out.print("Enter car brand: ");
        String brand = reader.readLine();
        System.out.print("Enter car ID: ");
        String id = reader.readLine();
        System.out.print("Enter engine size: ");
        int size = Integer.parseInt(reader.readLine());
        System.out.print("Enter horse power: ");
        int hpower = Integer.parseInt(reader.readLine());

        Engine myEng = new Engine(size, hpower);
        Car myCar = new Car(color, brand, id, myEng);
        System.out.println(myCar.toString());
    }//main


}//class
