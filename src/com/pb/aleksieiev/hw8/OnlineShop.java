package com.pb.aleksieiev.hw8;

import java.sql.Struct;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userLogin, userPassword, userConfirmPassword;

        System.out.println("Добро пожаловть! Введите свой логин");
        userLogin= scan.nextLine();

        System.out.println("Введите пароль.");
        userPassword = scan.nextLine();

        System.out.println("Повторите пароль.");
        userConfirmPassword = scan.nextLine();


        Auth auth = new Auth();

        try {
            auth.signUp(userLogin, userPassword, userConfirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Чтобы войти введите логин");
        userLogin= scan.nextLine();
        System.out.println("введите пароль");
        userPassword = scan.nextLine();
        try {
            auth.signIn(userLogin, userPassword);
        } catch (WrongLoginException e) {
            System.err.println(e.getMessage());
        }

    }
}
