package Code;

/**
 * Interface, contains the abstract method display().
 * Abstract method, will be implemented in child classes(Date, Name, Person, Author, Book, Biography, Autobiography)
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public interface Printable {

    /**
     * Abstract method, information about the classes in String. This method will be implemented in child classes.
     * @return Each class's information in String
     */
    public abstract String display();
}
