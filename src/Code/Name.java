package Code;

/**
 * This class models full name.
 * getFirstN() a getter for first name
 * getLastN() a getter for last name
 * firstNameValidation() Validation method to check if first name is not null or blank or more than 50 characters.
 * lastNameValidation() Validation method to check if last name is not null or blank or more than 50 characters.
 * display() Implementing abstract method from interface Printable to print full name.
 * getFullName() returning the full name in uppercase for first letter of first name and last name, and rest letters
 * in lowercase.
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Name implements Printable
{
    private final String firstName;
    private final String lastName;

    private final int maxChars      = 50;
    private final int nameIndexZero = 0;
    private final int nameIndexOne  = 1;

    /**
     * Creating a constructor
     * @param firstName first name
     * @param lastName last name
     */
    public Name(final String firstName, final String lastName) {
        // Validating first name and last name
        firstNameValidation(firstName);
        lastNameValidation(lastName);

        this.firstName = firstName;
        this.lastName  = lastName;
    }

    /**
     * Creating a getter for first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Creating a getter for last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Creating a method that returns the full name in uppercase for first letter of first name and last name, and rest
     * letters in lowercase.
     * @return the full name
     */
    public String getFullName() {
        return firstName.substring(nameIndexZero, nameIndexOne).toUpperCase() +
                firstName.substring(nameIndexOne).toLowerCase() + " " +
                lastName.substring(nameIndexZero, nameIndexOne).toUpperCase() +
                lastName.substring(nameIndexOne).toLowerCase();
    }

    /**
     * Validation method to check if first name is not null or blank or more than 50 characters.
     * @param firstN first name
     */
    private void firstNameValidation (final String firstN) {
        if (firstN == null || firstN.isBlank() || firstN.length() > maxChars) {

            throw new IllegalArgumentException(String.format("First name cannot be null or blank or more than %d " +
                                                                     "characters :/",maxChars));
        }
    }

    /**
     * Validation method to check if last name is not null or blank or more than 50 characters.
     * @param lastN last name
     */
    private void lastNameValidation (final String lastN) {
        if (lastN == null || lastN.isBlank() || lastN.length() > maxChars) {

            throw new IllegalArgumentException(String.format("Last name cannot be null or blank or more than %d " +
                                                                    "characters :/",maxChars));
        }
    }

    /**
     * Implementing abstract method from interface Printable.
     * Printing full name.
     * @return full name in String
     */
    @Override
    public String display(){

        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(getFullName());

        return builder.toString();
    }


















}
