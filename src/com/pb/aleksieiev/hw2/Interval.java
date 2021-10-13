package com.pb.aleksieiev.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.println("Введите число: ");
        userNumber = scan.nextInt();

        if (0 <= userNumber && userNumber <= 14) {
            System.out.println("Ваше число:" + userNumber + " - входит в интервал [0 -14]");
        } else if (15 <= userNumber && userNumber <= 35) {
            System.out.println("Ваше число:" + userNumber + " - входит в интервал [15 - 35]");
        } else if (36 <= userNumber && userNumber <= 50) {
            System.out.println("Ваше число:" + userNumber + " - входит в интервал [36 - 50]");
        } else if (51 <= userNumber && userNumber <= 100) {
            System.out.println("Ваше число:" + userNumber + " - входит в интервал [51 - 100]");
        } else {
            System.out.println("Ваше число: " + userNumber + " не вошло не в один интервал.");
        }
    }
}

