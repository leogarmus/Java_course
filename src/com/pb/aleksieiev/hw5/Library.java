package com.pb.aleksieiev.hw5;

public class Library {
    public static void main(String[] args) {

        Reader readers[] = new Reader[2];

        readers[0] = new Reader("Петров Петр Петрович", 1235, "Faculty1", "12.02.1998", "911");
        readers[1] = new Reader("Сидоров Марс Васильевич", 6963, "Faculty2", "01.06.2000", "937-99-92");

        Book books[] = new Book[4];
        books[0] = new Book("Атлас", "Смирнов О.В.", 1999);
        books[1] = new Book("Словарь", "Омельченко О.П.", 2012);

        books[2] = new Book("Дюймовочка", "Андерсог Г.Ч.", 1835);
        books[3] = new Book("Дама с собачой", "Чехов А.П.", 1898);

        System.out.println("Данные о читателях:");
        for (Reader reader: readers) {
            System.out.println("------------------");
            System.out.println("ФИО: " + reader.getName());
            System.out.println("Номер читательского билета: " + reader.getTicketNumber());
            System.out.println("Факультет: " + reader.getFaculty());
            System.out.println("Дата рождения: " + reader.getBirthDate());
            System.out.println("Номер телефона: " + reader.getPhoneNumber());
        }


        System.out.println("***********************");


        System.out.println("Данные о книгах:");
        for (Book book: books) {
            System.out.println("------------------");
            System.out.println("Название книги: " + book.getBookName());
            System.out.println("Автор книги: " + book.getAuthor());
            System.out.println("Год издания: " + book.getYear());

        }

        System.out.print("===================================\nРабота метода takebook():\n===================================\n");

        readers[0].takeBook(2);
        readers[1].takeBook(5);

        readers[0].takeBook("Словарь", "Атлас");
        readers[1].takeBook("Дюймовочка", "Дама с собачой");

        readers[0].takeBook(books[0], books[1]);
        readers[1].takeBook(books[2], books[3], books[0], books[1]);

        System.out.print("===================================\nРабота метода returnbook():\n===================================\n");


        readers[0].returnBook(2);
        readers[1].returnBook(5);

        readers[0].returnBook("Словарь", "Атлас");
        readers[1].returnBook("Дюймовочка", "Дама с собачой");

        readers[0].returnBook(books[0], books[1]);
        readers[1].returnBook(books[2], books[3], books[0], books[1]);


    }


}
