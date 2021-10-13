package com.pb.aleksieiev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operand1, operand2;
        String sign;

        System.out.println("Введине первое число");
        operand1 = scan.nextInt();

        System.out.println("Введине второе число");
        operand2 = scan.nextInt();

        System.out.println("Введине знак арифметической операции");
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println(operand1 + " / " + operand2 + " = "+ (operand1 / operand2));
                }
                break;
        }
    }
}
