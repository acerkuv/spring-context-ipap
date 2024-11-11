package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Context1.class);

        Driver driver = context.getBean("driverFirst", Driver.class);
        Cars cars = context.getBean("carFirst", Cars.class);

        cars.setDriver(driver);
        cars.drive();

        System.out.println(cars.toString());

        ;

    }
}