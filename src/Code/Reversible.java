package Code;

/**
 * Interface, contains the abstract method backward().
 * Abstract method, will be implemented in child classes(Person, Book)
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public interface Reversible
{
    /**
     * Abstract method to prints the name and title backward. This method will be implemented in child classes.
     * @return the name and title backward
     */
    public abstract String backward();
}
