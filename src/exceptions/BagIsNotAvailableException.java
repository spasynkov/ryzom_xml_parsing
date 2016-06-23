package exceptions;

/**
 * Throws if failed to get character's bag info
 */
public class BagIsNotAvailableException extends Exception {
    public BagIsNotAvailableException() {
    }

    public BagIsNotAvailableException(String message) {
        super(message);
    }
}
