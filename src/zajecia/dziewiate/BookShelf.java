package zajecia.dziewiate;


import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index > 0 && index < this.books.size()) {
            return this.books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String author) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksTmp.add(book);
            }
        }
//        for (int i = 0; i < this.books.size(); i++) {
//            Book book = this.books.get(i);
//            if (book.getAuthor().equals(author)) {
//                booksTmp.add(book);
//            }
//        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() == releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int releaseDate) {
        ArrayList<Book> booksTemp = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getReleaseDate() >= releaseDate) {
                booksTemp.add(book);
            }
        }
        return booksTemp;
    }

    public ArrayList<Book> getBooksLongerThan(int numberOfPages) {
        ArrayList<Book> booksTemp = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getNumberOfPages() >= numberOfPages) {
                booksTemp.add(book);
            }
        }
        return booksTemp;
    }


}
