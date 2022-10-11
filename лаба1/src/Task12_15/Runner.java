package Task12_15;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Book b1 = new Book("Title 1", "Author 1", 1, 1);
        Book b2 = new Book("Title 2", "Author 2", 20, 2);
        Book b3 = new Book("Title 0", "Author 1", 15, 3);
        Book b4 = b1.clone();
        ProgrammerBook pb1 = new ProgrammerBook("Title 1", "Author 0", 12, 4, "Lang 1", 10);
        ProgrammerBook pb2 = new ProgrammerBook("Title 6", "Author 1", 74, 5, "Lang 1", 10);
        System.out.println(b1.toString());
        System.out.println(b4.toString());
        System.out.println("b1 == b2 : " + b1.equals(b2));
        System.out.println("b1 == b3 : " + b1.equals(b3));
        System.out.println("b1 == b4 : " + b1.equals(b4));
        System.out.println("b1 == b1 : " + b1.equals(b1));
        System.out.println("b1 == String : " + b1.equals("String"));
        System.out.println(b1.hashCode());
        System.out.println(pb1.toString());
        System.out.println("pb1 == pb2 : " + pb1.equals(pb2));

        Book[] arr = {b3, pb2, b1, pb1, b2, b4};
        System.out.println("\n\nDefault: " + Arrays.toString(arr) + "\n");
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr) + "\n");

        Arrays.sort(arr, new BookTitleComparator());
        System.out.println("Sorted by title: " + Arrays.toString(arr) + "\n");

        Arrays.sort(arr, new BookTitleComparator().thenComparing(new BookAuthorComparator()));
        System.out.println("Sorted by title, then by author: " + Arrays.toString(arr) + "\n");
    }
}
