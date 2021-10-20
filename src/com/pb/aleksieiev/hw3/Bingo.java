package com.pb.aleksieiev.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int x = random.nextInt(101);

        System.out.println("Давайте сыграем в игру?");
        System.out.println("Компьютер загадал число, а Вам нужно его отгадать");
        System.out.println("Для выхода введите: exit");

        int count = 0;
        int userNumber;



        System.out.println("Введите число");

        do {

            String userInput = scan.nextLine();

            if (userInput.equals("exit")) {
                System.out.println("Вы вышли из игры. Количество попыток: " + count);
                break;
            } else {

                try {
                    Integer.parseInt(userInput);
                } catch (Exception e) {
                    System.out.println("Это не число. Игра закончена.");
                    break;
                }
                userNumber = Integer.parseInt(userInput);
            }

            if (userNumber < x) {
                System.out.println("Загаданное число больше, попробуйте ещё раз");
            } else if (userNumber > x) {
                System.out.println("Загаданное число меньше, попробуйте ещё раз");
            }
            count++;

            if (userNumber == x)
                System.out.println("Бинго! Вы угадали c " + count + " попытки. Это было число: " + x);
        } while ( userNumber != x);


    }
}
