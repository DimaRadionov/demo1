package com.example.demo1;

public class Car {

    public String color;
    public Integer maxSpeed;

    public Car(String color, Integer maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void main(String[] args) {


        Car car1 = new Car("Red" , 180);
        Car car2 = new Car("Green" , 140);
        Car car3 = new Car("Blue" , 100);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());


    }



}
