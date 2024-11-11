package org.example;


public class Driver {

    String fio;

    public Driver(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                '}';
    }

}
