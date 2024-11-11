package org.example;

public class Engine {
    String typeOfEngine;
    int volumeOfPower;

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public Engine(String typeOfEngine, int volumeOfPower) {
        this.typeOfEngine = typeOfEngine;
        this.volumeOfPower = volumeOfPower;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public int getVolumeOfPower() {
        return volumeOfPower;
    }

    public void setVolumeOfPower(int volumeOfPower) {
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
