package com.pb.aleksieiev.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
        Animal animals[] = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Horse();


        Class docClasszz = Class.forName("com.pb.aleksieiev.hw6.Veterinarian");
        Constructor constr = docClasszz.getConstructor(new Class[]{});
        Object objDoc = constr.newInstance();

        for (Animal animal : animals) {
            ((Veterinarian) objDoc).treatAnimal(animal);
        }

        System.out.println("=========================");

        Dog dogg = new Dog();
        dogg.getInfo();

        Cat catt = new Cat();
        catt.getInfo();

        Horse horss = new Horse();
        horss.getInfo();
    }
}
