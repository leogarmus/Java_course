package com.pb.aleksieiev.hw4;

import java.util.Scanner;


public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку");
        String userString = scan.nextLine();

       System.out.println(capitalize(userString));
    }

    static String capitalize(String phrase){
        String [] words = phrase.split(" ");
        StringBuilder newPhrase = new StringBuilder();
        for (String word : words) {
            newPhrase.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
        }
        return newPhrase.toString().trim();
    }
}
