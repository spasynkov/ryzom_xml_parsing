package model;

import java.util.List;

/**
 * Represents player's animals
 */
public class Animal {
    private byte id;
    private String sheet;               // nullable
    private boolean status;             // false if not present

    private boolean isInStables;
    private long stablesId;

    private List<Item> inventory;

    public String getName() {
        return (id == 0) ? "Mount" : "Packer #" + id;
    }
}
