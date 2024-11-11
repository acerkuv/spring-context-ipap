package org.example;

public class Engine {
    String typeOfEngine;
    int volumeOfPower;


    public Engine(String typeOfEngine, int volumeOfPower) {
        this.typeOfEngine = typeOfEngine;
        this.volumeOfPower = volumeOfPower;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", volumeOfPower=" + volumeOfPower +
                '}';
    }
}
