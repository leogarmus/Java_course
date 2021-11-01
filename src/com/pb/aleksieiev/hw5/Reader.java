package com.pb.aleksieiev.hw5;

public class Reader {
    private String name;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;


    public Reader(String name, int ticketNumber, String faculty, String birthDate, String phoneNumber){
        this.name = name;
        this. ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public int getTicketNumber(){
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void takeBook(int countBook){
        System.out.println( getName() + " взял "+ countBook +" книги.");
    }

    public void takeBook(String... books) {
        StringBuilder newBooks = new StringBuilder();
        for (String book : books) {
            newBooks.append(book + ", ");
        }
        System.out.println(getName() + " взял книги: " + newBooks.substring(0, newBooks.length() -2) + ".");
    }

    public void takeBook(Book...books) {
        System.out.print(getName() + " взял книги: ");

        for (int i = 0; i < books.length; i++) {
            if (i == books.length -1) {
                System.out.print(books[i].getBookName() + " (" + books[i].getAuthor() + " " + books[i].getYear() + " г.). ");

            } else  {
                System.out.print(books[i].getBookName() + " (" + books[i].getAuthor() + " " + books[i].getYear() + " г.), ");
            }
        }

       System.out.print("\n");

    }


    public void returnBook(int countBook){
        System.out.println( getName() + " вернул "+ countBook +" книги.");
    }

    public void returnBook(String... books) {
        StringBuilder newBooks = new StringBuilder();
        for (String book : books) {
            newBooks.append(book + ", ");
        }
        System.out.println(getName() + " вернул книги: " + newBooks.substring(0, newBooks.length() -2) + ".");
    }

    public void returnBook(Book...books) {
        System.out.print(getName() + " вернул книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getBookName() + " (" + books[i].getAuthor() + " " + books[i].getYear() + " г.)");

            if (i == books.length -1) {
                System.out.print(". ");

            } else {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }
}
