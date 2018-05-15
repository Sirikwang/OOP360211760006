package lab8;

public class petApp {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAge(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());

        Cat c1 = new Cat();
        c1.setName("Kwang");
        c1.setAge(1);

        System.out.println(c1.toString()+" "+c1.getClass().getSimpleName());

    }//main
}//class
