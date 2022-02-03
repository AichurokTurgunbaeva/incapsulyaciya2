package com.company;

public class Laptop {
    private String laptopName;
    private int memory;
    private String color;
    private String cpu;

    void turnOn() {
        System.out.println("Laptop turned on");
    }
    void shutDown() {
        System.out.println("Laptop shut down");
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
