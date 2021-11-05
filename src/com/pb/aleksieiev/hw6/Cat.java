package com.pb.aleksieiev.hw6;

import java.util.Objects;

public class Cat extends Animal {
    public String genus = "кошачьи";

    public Cat(){
        this.name = "Мурзик";
        this.food = "кошачий корм";
        this.location = "коробке";
    }

    public void makeNoise() {
        System.out.println(getName() + " делает: мяу-мяу");
    }

    public void eat() {
        System.out.println(getName() + " кушает " + this.food);
    }

    public void sleep() {
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
        Cat cat = (Cat) o;
        return Objects.equals(genus, cat.genus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genus);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "genus='" + genus + '\'' +
                '}';
    }
}
