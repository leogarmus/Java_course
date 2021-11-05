package com.pb.aleksieiev.hw6;

import java.util.Objects;

public class Horse extends Animal {

    public String genus = "лошадиные";

    public Horse(){
        this.name = "Буцифал";
        this.location = "стойле";
        this.food = "овёс";
    }


    public void makeNoise(){
        System.out.println(" делает: иго-го");
    }

    public void eat() {
        System.out.println(" кушает " + this.food);
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
        Horse horse = (Horse) o;
        return Objects.equals(genus, horse.genus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genus);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "genus='" + genus + '\'' +
                '}';
    }
}
