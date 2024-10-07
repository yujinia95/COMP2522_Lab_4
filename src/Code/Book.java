package Code;

/**
 * This class models Book information.
 * getTitle() a getter for title.
 * getYearPublished() a getter for  published year of book.
 * getAuthor() a getter for author.
 * titleValidation() to check if title is not null or blank or more than 100 characters.
 * yearPublishedValidation() to check if published year of book is between year 1 to the current year.
 * authorValidation() to check if author is not null.
 * compareTo() a comparable method to find older book by comparing their published years.
 * compareBooks() Comparing two books and return explanation of which book is older.
 * display() Implementing abstract method from interface Printable. Printing title, published year, author's
 * information.
 * backward() Implementing abstract method from interface Reversible. Reversing title.
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Book implements Comparable<Book>, Printable, Reversible {

    private final String    title;
    private final int       yearPublished;
    private final Author    author;

    private final int minTitleStr   = 100;
    private final int firstYear     = 1;
    private final int currentYear   = 2024;

    /**
     * Creating a constructor
     * @param title title of book
     * @param yearPublished published year
     * @param author author of book
     */
    public Book (final String title, final int yearPublished, final Author author) {

        titleValidation(title);
        yearPublishedValidation(yearPublished);
        authorValidation(author);

        this.title          = title;
        this.yearPublished  = yearPublished;
        this.author         = author;
    }

    /**
     * Creating a getter for title.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creating a getter for  published year of book.
     * @return  published year of book
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Creating a getter for author.
     * @return author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Validation method to check if title is not null or blank or more than 100 characters.
     * @param title title of book
     */
    private void titleValidation(final String title) {

        if (title == null || title.isBlank() || title.length() > minTitleStr) {

            throw new IllegalArgumentException(String.format("Title of book cannot be null or blank or more than %d " +
                                                                     "characters :/",minTitleStr));
        }
    }

    /**
     * Validation method to check if published year of book is between year 1 to the current year.
     * @param yearPublished published year
     */
    private void yearPublishedValidation(final int yearPublished) {

        if(yearPublished < firstYear || yearPublished > currentYear) {

            throw new IllegalArgumentException(String.format("Published year of book must be between %d to %d :/",
                                                             firstYear, currentYear));
        }
    }

    /**
     * Validation method to check if author is not null.
     * @param author book author
     */
    private void authorValidation(final Author author) {

        if( author == null) {
            throw new IllegalArgumentException("Information of author cannot be null :/");
        }
    }

    /**
     * Creating a comparable method to find older book by comparing their published years.
     * @param otherBook the object to be compared.
     * @return older book
     */
    @Override
    public int compareTo(final Book otherBook) {

        return this.getYearPublished() - otherBook.getYearPublished();
    }

    /**
     * Compare two books and return explanation of which book is older.
     * @param otherBook other book to compare with
     * @return explanation of which book is older
     */
    public String compareBooks(final Book otherBook) {

        if (this.compareTo(otherBook) < 0) {
            return this.getTitle() + " is older than " + otherBook.getTitle();
        } else if (this.compareTo(otherBook) > 0) {
            return this.getTitle() + " is newer than " + otherBook.getTitle();
        } else {
            return this.getTitle() + " and " + otherBook.getTitle() + " were published in the same year.";
        }
    }

    /**
     * Implementing abstract method from interface Printable.
     * Printing title, published year, author's information.
     * @return title, published year, author's information in String
     */
    @Override
    public String display() {

        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append("Title of book: ").append(getTitle()).append("\nPublished year: ").
                append(getYearPublished()).append("\nAuthor: ").append(getAuthor().getAuthorName());

        return builder.toString();
    }

    /**
     * Implementing abstract method from interface Reversible.
     * Reversing title.
     * @return reversed title in String
     */
    @Override
    public String backward() {

        final StringBuilder reverseBuilder;
        reverseBuilder = new StringBuilder(getTitle());

        reverseBuilder.reverse();

        return "Reversed book title: " + reverseBuilder.toString();
    }
}
