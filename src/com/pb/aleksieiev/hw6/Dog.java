package com.pb.aleksieiev.hw6;

import java.util.Objects;

public class Dog extends Animal{

    public String genus = "псовые";

    public Dog(){
        this.name = "Бобик";
        this.location = "бутке";
        this.food = "собачий корм";
    }



    public void makeNoise(){
        System.out.println(getName() + " делает: гав-гав-гав");
    }

    public void eat() {
        System.out.println(getName() + " кушает " + this.food);
    }

    public void sleep(){
        System.out.println(getName() + " уснул.");
    }



    public String getGenus() {
        return genus;
    }

    public void getInfo(){
        System.out.println("Животное по кличке " + getName() +
                " относится к виду " + getGenus() +
                " живет в " + getLocation() +
                " и кушает " + getFood() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(genus, dog.genus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genus);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "genus='" + genus + '\'' +
                '}';
    }
}
