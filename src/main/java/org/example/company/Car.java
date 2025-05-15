package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    public String startEngine() {
        String msg = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + " => " + msg);
        return msg;
    }

    public String accelerate() {
        String msg = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + " => " + msg);
        return msg;
    }

    public String brake() {
        String msg = "the car is braking";
        System.out.println(getClass().getSimpleName() + " => " + msg);
        return msg;
    }


}


