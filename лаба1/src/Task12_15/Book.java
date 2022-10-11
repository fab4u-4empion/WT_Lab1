package Task12_15;

import java.util.Objects;

public class Book implements Comparable<Book> {
    protected String title;
    protected String author;
    protected int price;
    protected int isbn;
    protected static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book : {\n" +
                "\ttitle : '" + title + "',\n" +
                "\tauthor : '" + author + ", \n" +
                "\tprice : " + price + "\n" +
                "\tisbn : " + isbn + "\n" +
                '}';
    }

    @Override
    public Book clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(isbn, o.isbn);
    }
}
