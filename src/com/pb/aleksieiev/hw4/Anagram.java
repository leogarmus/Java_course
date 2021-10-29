package com.pb.aleksieiev.hw4;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String userStringFirst = scan.nextLine();
        System.out.println("Введите вторую строку");
        String userStringSecond = scan.nextLine();
        if (compare(userStringFirst, userStringSecond)) {
            System.out.println("Строки являются анаграмой");
        } else {
            System.out.println("Строки НЕ являются анаграмой");
        }
    }

    static Boolean compare(String firstStr, String secondStr) {
        Boolean result = Arrays.equals(preCompare(firstStr), preCompare(secondStr));
        return result;
    }

    static String[] preCompare(String str) {
        String newStr;
        newStr = str.toLowerCase().replaceAll("[^аАaA-яЯzZ]", "");
        String[] arStr = newStr.split("");
        Arrays.sort(arStr);
        return arStr;
    }

}
