package zajecia.dziewiate;

import java.util.ArrayList;

public class Zajecia9 {
    public static void main(String[] args) {
        User user = new User("Sebastain", "Piechowski", "20.03.83");
//        user.phoneNumber = " ";
//        User user2 = new User();
//        user2.firstName = "Mateo";
//        user2.lastName = "Borek";
//        user2.birthDate = "12344";
//        User[] users = new User[2];
//        users[0] = user;
//        users[1] = user2;
//        printUsers(users);
//        Address address = new Address("Poland", "Poznan", "Baraniaka", 88, "61-100");
//        user.address = address;
//        user.print();
        BookShelf bookShelf = new BookShelf();
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        Book book = new Book("Krzyzacy", "Henryk Sienkiewicz", 2000, message.split(" "));
        Book book1 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz", 2000, message.split(" "));
        Book book2 = new Book("Pan Wolodyjowski", "Henryk Sienkiewicz", 2010, message.split(" "));
        Book book3 = new Book("Dziady", "Adam Mickiewicz", 1994, message.split(" "));
        book.setCategory("Historyczna");
        book.setDescription("Nawet Fajna");
        bookShelf.add(book);
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);

        book.toString();

        ArrayList<Book> booksOf = bookShelf.getBooksFrom(2000);
        for (Book b : booksOf) {
            System.out.println(b.toString());
        }

        ArrayList<Book> booksOf1 = bookShelf.getBooksSince(2000);
        for (Book b : booksOf1) {
            System.out.println(b.toString());
        }

//        String page = book.getPage(5);
//        System.out.println(page);


    }

//    public static void printUsers(User[] users) {
//        for (int i = 0; i < users.length; i++) {
//            users[i].print();
//        }
//    }

}
