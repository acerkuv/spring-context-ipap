package org.example;

public class Cars extends Engine {
    String model;
    Driver driver;

    int number;


    public Cars(String typeOfEngine, int volumeOfPower, String model, int number) {
        super(typeOfEngine, volumeOfPower);
        this.model = model;
        this.number = number;
    }

    public  Driver getDriver() {
        return driver;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", driver=" + driver +
                ", number=" + number +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", volumeOfPower=" + volumeOfPower +
                '}';
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void  drive(){
        System.out.println("Двигатель заведен! " + " Водитель " + getDriver().toString());

    }
}
