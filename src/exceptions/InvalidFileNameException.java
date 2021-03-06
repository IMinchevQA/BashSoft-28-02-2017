package exceptions;

/**
 * Created by Ivan Minchev on 3/5/2017.
 */
public class InvalidFileNameException extends RuntimeException {

    public static final String FORBIDDEN_SYMBOLS_CONTAINED_IN_NAME =
            "The given name contains symbols that are not allowed to be used in names of files or folders.";

    public InvalidFileNameException() {
        super(FORBIDDEN_SYMBOLS_CONTAINED_IN_NAME);
    }

    public InvalidFileNameException(String message) {
        super(message);
    }
}
