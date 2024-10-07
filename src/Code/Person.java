package Code;

/**
 * This class models Person's information.
 * getDateOfBirth() a getter for date of birth.
 * getDateOfDeath() a getter for date of death.
 * getName() a getter for name.
 * dobValidation() Validation method to check if date of birth is not null.
 * compareTo() Creating a comparable method to find older person by comparing their date of birth.
 * comparePeople() Comparing two people and return explanation of which person is older.
 * display() Implementing abstract method from interface Printable. Printing full name, date of birth, date of death.
 * backward() Implementing abstract method from interface Reversible. Reversing full name.
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Person implements Comparable<Person>, Printable, Reversible {

    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Creatubg a constructor
     * @param dateOfBirth date of birth
     * @param dateOfDeath date of death
     * @param name full name
     */
    public Person(final Date dateOfBirth, final Date dateOfDeath, final Name name) {
        // Validating date of birth
        dobValidation(dateOfBirth);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name        = name;
    }

    /**
     * Creating a getter for date of birth.
     * @return date of birth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Creating a getter for date of death.
     * @return date of death
     */
    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Creating a getter for name.
     * @return name
     */
    public Name getName() {
        return name;
    }

    /**
     * Validation method to check if date of birth is not null.
     * @param dateOfBirth date of birth
     */
    private void dobValidation (final Date dateOfBirth) {
        if (dateOfBirth == null) {

            throw new IllegalArgumentException("Date of birth cannot be null :/");
        }
    }

    /**
     * Creating a comparable method to find older person by comparing their date of birth.
     * @param otherPerson the object to be compared.
     * @return older person
     */
    @Override
    public int compareTo(final Person otherPerson) {

        // If year is different
        if(this.getDateOfBirth().getYear() != otherPerson.getDateOfBirth().getYear()) {
            return this.getDateOfBirth().getYear() - otherPerson.getDateOfBirth().getYear();
        }

        // Year is the same, but if month is different
        if(this.getDateOfBirth().getMonth() != otherPerson.getDateOfBirth().getMonth()) {
            return this.getDateOfBirth().getMonth() - otherPerson.getDateOfBirth().getMonth();
        }

        // Year,month is the same, but find if day is different
        return this.getDateOfBirth().getDay() - otherPerson.getDateOfBirth().getDay();
    }

    /**
     * Compare two people and return explanation of which person is older.
     * @param otherPerson other person to compare with
     * @return explanation of which person is older
     */
    public String comparePeople(final Person otherPerson) {

        if (this.compareTo(otherPerson) < 0) {
            return this.getName().getFullName() + " is older than " + otherPerson.getName().getFullName();

        } else if (this.compareTo(otherPerson) > 0) {
            return this.getName().getFullName() + " is newer than " + otherPerson.getName().getFullName();

        } else {
            return this.getName().getFullName() + " and " + otherPerson.getName().getFullName() +
                    " were published in the same year.";
        }
    }

    /**
     * Implementing abstract method from interface Printable.
     * Printing full name, date of birth, date of death.
     * @return full name, date of birth, date of death in String
     */
    @Override
    public String display() {

        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(name.display()).append("\nDate Of Birth: ").append(getDateOfBirth().getDateInString());

        // If there is date of death, then print date of death
        if (getDateOfDeath() != null) {
            builder.append("\nDate Of Death: ").append(getDateOfDeath().getDateInString());
        }

        return builder.toString();
    }

    /**
     * Implementing abstract method from interface Reversible.
            * Reversing full name.
     * @return reversed full name in String
     */
    @Override
    public String backward() {

        final StringBuilder reverseBuilder;
        reverseBuilder = new StringBuilder(getName().getFullName());

        reverseBuilder.reverse();

        return "Reversed name: " + reverseBuilder.toString();
    }
}
