   package com.company
   
    public abstract class Car {


    String model = "Model: Q7";
    String color = "Color: Green";
    String speed = "MaxSpeed: 325 km/h";


    void gas  () {
        System.out.println("gas:" + 100);
    }

    void brake () {
        System.out.println("brake: " + 20);
    }
    abstract void description();
}

