package Code;

import java.util.Objects;

/**
 * This class models biography book.
 * getSubject() a getter for title.
 * subjectValidation() Validation method to check if subject is not null.
 * equals() a methods to compare two biographies if they have the same subject
 * hashCode() a method to returns the object's hash code in integer, if the object is null, it returns 0.
 * display() Implementing abstract method from interface Printable. Printing title, published year, author's full
 * name, date of birth, date of death, genre.
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Biography extends Book implements Printable {

    private final Person subject;

    /**
     * Creating a constructor
     * @param title title of book
     * @param yearPublished published year
     * @param author author of book
     * @param subject no null
     */
    public Biography (final String title, final int yearPublished, final Author author, final Person subject) {
        super(title, yearPublished, author);

        subjectValidation(subject);

        this.subject = subject;
    }

    /**
     * Creating a getter for subject.
     * @return subject
     */
    public Person getSubject() {
        return subject;
    }

    /**
     * Validation method to check if subject is not null.
     * @param subject subject
     */
    private void subjectValidation(Person subject) {

        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null :/");
        }
    }

    /**
     * Creating a methods to compare two biographies if they have the same subject
     * @param obj other biography to compare
     * @return if they have the same subject, then it's true.
     */
    @Override
    public boolean equals(final Object obj) {

        if(obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Biography)) {
            return false;
        }

        final Biography otherBiography;

        otherBiography = (Biography)obj;

        return this.getSubject().equals(otherBiography.getSubject());
    }

    /**
     * Creating a method to returns the object's hash code in integer, if the object is null, it returns 0.
     * @return object's hash code
     */
    public int hashCode() {
        return Objects.hashCode(getSubject());
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
