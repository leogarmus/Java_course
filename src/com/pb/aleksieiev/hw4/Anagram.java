package com.pb.aleksieiev.hw4;

import java.util.Arrays;
import java.util.Locale;
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
        String newSF = new String();
        String newSS = new String();
        newSF = firstStr.toLowerCase().replaceAll("[^аА-яЯ]", "");
        newSS = secondStr.toLowerCase().replaceAll("[^аА-яЯ]", "");
        String[] arStrF = newSF.split("");
        String[] arStrS = newSS.split("");
        Arrays.sort(arStrF);
        Arrays.sort(arStrS);

        Boolean result = Arrays.equals(arStrF, arStrS);
        return result;
    }

}
