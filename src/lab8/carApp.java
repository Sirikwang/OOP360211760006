package lab8;

public class carApp {
    public static void main(String[] args) {

        Engine e = new Engine();
        e.setEngSize(2500);
        e.setHorsePower(150);

        Car c = new Car();
        c.setColor("Red");
        c.setBrand("Honda");
        c.setCarID("กข-1234");
        c.setEngine(e);

        System.out.println(c.toString());
    }//main


}//class
