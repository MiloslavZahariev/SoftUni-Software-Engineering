package JavaProgramingAdvanced.IteratorsAndComparators.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);

        List<Book> books = new ArrayList<>();
        books.add(bookThree);
        books.add(bookTwo);
        books.add(bookOne);

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
