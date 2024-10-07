package Test;

import Code.*;

/**
 * Main driver
 */
public class Main
{
    public static void main(final String[] args) {

        // =====Author Declaration=====
        // George Orwell
        final String    firstN1;
        final String    lastN1;
        final String    genre1;
        final Date      dateBorn1;
        final Date      dateDied1;
        final Author    author1;
        // Harper Lee
        final String    firstN2;
        final String    lastN2;
        final String    genre2;
        final Date      dateBorn2;
        final Date      dateDied2;
        final Author    author2;

        // =====Name Declaration=====
        // George Orwell
        final Name      name1;
        // Harper Lee
        final Name      name2;

        // =====Book Declaration=====
        // George Orwell
        final Book      book1;
        // Harper Lee
        final Book      book2;

        // =====Instantiation for instance of Author class=====
        // George Orwell
        firstN1         = "George";
        lastN1          = "Orwell";
        genre1          = "Dystopia";
        dateBorn1       = new Date(1903,6,25);
        dateDied1       = new Date(1950, 1, 21);
        // Harper Lee
        firstN2         = "Harper";
        lastN2          = "Lee";
        genre2          = "Literature";
        dateBorn2       = new Date(1926,4,28);
        dateDied2       = new Date(2016, 2, 19);

        // =====Name Instantiation=====
        // George Orwell
        name1           = new Name(firstN1,lastN1);
        // Harper Lee
        name2           = new Name(firstN2,lastN2);

        // =====Author Instantiation=====
        // George Orwell
        author1         = new Author(dateBorn1, dateDied1, name1, genre1);
        // Harper Lee
        author2         = new Author(dateBorn2, dateDied2, name2, genre2);

        // =====Book Instantiation=====
        // George Orwell
        book1           = new Book("1984", 1949, author1);
        // Harper Lee
        book2           = new Book("To Kill a Mockingbird", 1960, author2);

        // =====Displaying book information=====
        System.out.println("");
        System.out.println(book1.display());
        System.out.println("");
        System.out.println(book2.display());

        // =====Reversing book name=====
        System.out.println("");
        System.out.println(book1.backward());
        System.out.println(book2.backward());

        // =====Displaying author information=====
        System.out.println("");
        System.out.println(author1.display());
        System.out.println("");
        System.out.println(author2.display());

        // =====Reversing author name=====
        System.out.println("");
        System.out.println(author1.backward());
        System.out.println(author2.backward());

        // =====Comparing two books=====
        System.out.println("");
        System.out.println(book1.compareBooks(book2));

        // =====Comparing two authors=====
        System.out.println("");
        System.out.println(author1.comparePeople(author2));

    }
}
