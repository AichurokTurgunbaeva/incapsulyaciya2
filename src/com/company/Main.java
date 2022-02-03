package com.company;

public class Main {

    public static void main(String[] args) {
	   Laptop laptop = new Laptop();
       laptop.setLaptopName("HP");
       laptop.setMemory(512);
       laptop.setColor("grey");
       laptop.setCpu("Core-i5");

        System.out.println(laptop.getLaptopName());
        System.out.println(laptop.getMemory());
        System.out.println(laptop.getColor());
        System.out.println(laptop.getCpu());
        laptop.turnOn();
        laptop.shutDown();

    }
}
