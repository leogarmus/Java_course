package com.pb.aleksieiev.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 чисел");
        int[] arr = new int[10];
        int sum = 0;
        int sumPos = 0;
        int temp;

      for (int i = 0; i < arr.length; i++) {
          arr[i] = scan.nextInt();
       }

        System.out.print("Готово, Вы ввели: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if (arr[i] > 0) {
                sumPos += arr[i];
            }
        }

        System.out.println("\nСумма всех элементов: " + sum);
        System.out.println("Сумма всех положительных элементов: " + sumPos);

        System.out.println("Отсортированный массив: ");
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
