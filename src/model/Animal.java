package model;

import java.util.List;

/**
 * Represents player's animals
 */
public class Animal {
    private byte id;
    private List<Item> inventory;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public Animal() {
    }

    public Animal(byte id, List<Item> inventory) {
        this.id = id;
        this.inventory = inventory;
    }

    public String getName() {
        return (id == 0) ? "Mount" : "Packer #" + id;
    }
}
