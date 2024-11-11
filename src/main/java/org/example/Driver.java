package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


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

    public void setFio(String fio) {
        this.fio = fio;
    }
}
