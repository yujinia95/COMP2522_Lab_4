package Code;

/**
 * This class models author's information.
 * getGenre() a getter for genre.
 * getAuthorName() to get an author full name
 * genreValidation() to check if genre is not null or blank or more than 30 characters.
 * display() Implementing abstract method from interface Printable. Printing full name, date of birth, date of death,
 * genre.
 * getAuthorName() to get an author full name
 *
 * @author Yujin Jeong
 * @version 1.0
 */
public class Author extends Person implements Printable{

    private final String genre;

    private final int minGenreStr = 30;

    /**
     *
     * @param dateOfBirth
     * @param dateOfDeath
     * @param name
     * @param genre
     */
    public Author(final Date dateOfBirth, final Date dateOfDeath, final Name name, final String genre) {
        super(dateOfBirth, dateOfDeath, name);

        genreValidation(genre);

        this.genre = genre;
    }

    /**
     * Creating a getter for genre.
     * @return genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Method to get an author full name
     * @return author full name
     */
    public String getAuthorName() {
        return getName().getFullName();
    }

    /**
     * Validation method to check if genre is not null or blank or more than 30 characters.
     * @param genre genre
     */
    private void genreValidation (final String genre) {
        if (genre == null || genre.isBlank() || genre.length() > minGenreStr) {
            throw new IllegalArgumentException(String.format("Genre cannot be null or blank or more than %d " +
                                                                     "characters :/", minGenreStr));
        }
    }

    /**
     * Implementing abstract method from interface Printable. Printing full name, date of birth, date of death, genre.
     * @return full name, date of birth, date of death, genre in String
     */
    @Override
    public final String display() {

        final StringBuilder builder;
        builder = new StringBuilder();

        builder.append(super.display()).append("\nGenre: ").append(getGenre());

        return builder.toString();
    }
}

