package lab8;
//1. engine size
//2. horse power

public class Engine {
    private int engSize;
    private int horsePower;


    //constructor
    public Engine(){}
    public Engine(int engSize, int horsePower) {
        this.engSize = engSize;
        this.horsePower = horsePower;
    }

    //toSting
    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsePower=" + horsePower +
                '}';
    }

    //getterandsetter

    public void Engine() {
    }

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


}//class


