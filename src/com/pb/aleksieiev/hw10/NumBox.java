package com.pb.aleksieiev.hw10;

public class NumBox <T extends Number>{
    private final T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public void add(T num){

    }
    public T get(int index) {
        return numbers[index];
    }
    public int length(){
        return numbers.length;
    }
    public double sum(){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] instanceof Integer) {
                sum = numbers[i].intValue() + sum;
            } else if (numbers[i] instanceof Double) {
                sum = numbers[i].doubleValue() + sum;
            } else if (numbers[i] instanceof Float) {
                sum = numbers[i].floatValue() + sum;
            }
        }
        return sum;
    }
    public double average(){
        double average;
        average = sum()/length();
        return average;
    };

}
