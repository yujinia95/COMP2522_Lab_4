package Code;

/**
 * This class models autobiography that 'subject' is automatically set to the 'author'.
 * display() Implementing abstract method from interface Printable. Printing title, published year, author's full
 * name, date of birth, date of death, genre.
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Autobiography extends Biography implements Printable{

    /**
     * Creating a constructor
     * @param title title of the book
     * @param yearPublished published year
     * @param author author of book
     * @param subject subject
     */
    public Autobiography (final String title, final int yearPublished, final Author author, final Person subject) {
        super(title, yearPublished, author, author);
    }

    /**
     * Implementing abstract method from interface Printable. Printing title, published year, author's full name,
     * date of birth, date of death, genre.
     * @return title, published year, author's full name, date of birth, date of death, genre in String
     */
    @Override
    public String display() {

        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.display());

        return builder.toString();
    }
}
