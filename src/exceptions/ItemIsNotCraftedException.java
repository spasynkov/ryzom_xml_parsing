package exceptions;

/**
 * Throws when request crafting params for non-crafted item
 */
public class ItemIsNotCraftedException extends Exception {
    public ItemIsNotCraftedException() {
    }

    public ItemIsNotCraftedException(String message) {
        super(message);
    }
}
