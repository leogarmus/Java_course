package com.pb.aleksieiev.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(
                "У доктора сейчас на приеме животное по кличке " + animal.getName() +
                        " оно кушает: " + animal.getFood() + "" +
                        " и живет в " + animal.getLocation() + "."
        );
    }
}
