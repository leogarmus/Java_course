package com.pb.aleksieiev.hw6;

public abstract class Animal {

    public String food;
    public String location;
    public String name;

    public String genus;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    };

    public void setLocation(String location){
        this.location = location;
    }

    public String getFood(){
        return this.food;
    }

    public String getLocation() {
        return this.location;
    }


}
