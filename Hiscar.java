package com.company;

public class Hiscar implements Carinterface{

    @Override
    public void gas() {
        System.out.println("Gas");
    }

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void description() {
        System.out.println("Car description");
    }
}

