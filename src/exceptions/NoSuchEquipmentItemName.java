package exceptions;

/**
 * Throws when wrong equipment item name
 */
public class NoSuchEquipmentItemName extends Exception {
    public NoSuchEquipmentItemName() {
    }

    public NoSuchEquipmentItemName(String message) {
        super(message);
    }
}
