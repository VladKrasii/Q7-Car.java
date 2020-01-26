package com.company;

import java.util.Scanner;

public class Main {

    String name;
    int age;

    Main(){}



    Main(String name){
        this.name = name;
    }

    Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {

        Main obj1 = new Main();
        Main obj2 = new Main("Vladimir");
        Main obj3 = new Main("Sergei",32);
        obj1.display();
        obj2.display();
        obj3.display();

  }

}