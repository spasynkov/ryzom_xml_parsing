package exceptions;

/**
 * Throws if can't find item in the bag
 */
public class NoSuchItemInTheBagException extends Exception {
    public NoSuchItemInTheBagException() {
    }

    public NoSuchItemInTheBagException(String message) {
        super(message);
    }
}
