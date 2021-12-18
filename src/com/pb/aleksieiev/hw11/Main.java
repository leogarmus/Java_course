package com.pb.aleksieiev.hw11;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.pb.aleksieiev.hw11.libs.ContactBook;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        List<ContactItem> book = new ArrayList<>();
        waitCommand(book);


    }

    static void waitCommand(List<ContactItem> book) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Список комманд: ");
        System.out.println("add - для добавления команды, rm - для удалени номера, ls - для показа всех контактов, fn - поиска" +
                "\n" + "update - для обновления");
        System.out.println("Введите команду");
        String userCommand = scan.nextLine();

        if (userCommand.equals("add")) {
            addContact(book);
            waitCommand(book);
        } else if (userCommand.equals("ls")) {
            showBook(book);
            waitCommand(book);
        } else if (userCommand.equals("rm")) {
            removeByName(book);
            waitCommand(book);
        } else if (userCommand.equals("fn")) {
            findByName(book);
            waitCommand(book);
        } else if (userCommand.equals("update")) {
            updateByName(book);
            waitCommand(book);
        } else {
            System.out.println("Введите доступную команду");
            waitCommand(book);

        }
    }

    static void addContact(List<ContactItem> book) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = scan.nextLine();
        System.out.println("Введите номер");
        String pno = scan.nextLine();
        System.out.println("Введтите адресс");
        String address = scan.nextLine();
        System.out.println("Введите дату рождения в формате гггг-мм-дд");
        LocalDate dateOfBirth = LocalDate.parse(scan.nextLine());
        ContactItem newContact = new ContactItem(name, dateOfBirth, address, pno);
        book.add(newContact);
        System.out.println("Контакт успешно добавлен");
    }

    static void showBook(List<ContactItem> book) {
        System.out.println("======Ваши контакты=====");
        System.out.println(book);
        System.out.println("=======================");
    }

    static int findIndexByName(List<ContactItem> book, String name) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static void removeByName(List<ContactItem> book) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = scan.nextLine();
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equals(name)) {
                book.remove(i);
                System.out.println("Контакт удален");
            } else {
                System.out.println("Контакт не найден");
            }
        }
    }

    static void findByName(List<ContactItem> book) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = scan.nextLine();
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equals(name)) {
                System.out.println(book.get(i));
            } else {
                System.out.println("Конткакт не найден");
            }
        }
    }

    static void updateByName(List<ContactItem> book) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО кондакта которое хотите изменить");
        String name = scan.nextLine();
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equals(name)) {
                System.out.println(book.get(i));
                System.out.println("Введите новое ФИО");
                String newName = scan.nextLine();
                System.out.println("Введите номер");
                String pno = scan.nextLine();
                System.out.println("Введтите адресс");
                String address = scan.nextLine();
                System.out.println("Введите дату рождения в формате гггг-мм-дд");
                LocalDate dateOfBirth = LocalDate.parse(scan.nextLine());
                book.get(i).setName(newName);
                book.get(i).setAddress(address);
                book.get(i).setPhone(pno);
                book.get(i).setDateOfBirth(dateOfBirth);
                book.get(i).setUpdateDate(LocalDate.now());
            }
        }
    }
}
