package model;

import exceptions.ItemIsNotCraftedException;

/**
 * Represents each item
 */
public class Item {
    private short slot;
    private long id;
    private String name;    // sheet
    private short quality;  // quality
    private short hitPoints;// hp
    private int quantity;   // stack

    private CraftedItem craftParameters;

    private boolean isLocked;

    public short getSlot() {
        return slot;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public short getQuality() {
        return quality;
    }
    public short getHitPoints() {
        return hitPoints;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean isCrafted() {
        return craftParameters != null;
    }
    public CraftedItem getCraftParameters() throws ItemIsNotCraftedException {
        if (craftParameters != null) return craftParameters;
        throw new ItemIsNotCraftedException("Current item is not crafted so can't return its crafted params.");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuality(short quality) {
        this.quality = quality;
    }
    public void setHitPoints(short hitPoints) {
        this.hitPoints = hitPoints;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setCraftParameters(CraftedItem craftParameters) {
        this.craftParameters = craftParameters;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Item() {
    }

    public Item(short slot, long id, String name, short quality, short hitPoints, int quantity, boolean isLocked) {
        this.slot = slot;
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.hitPoints = hitPoints;
        this.quantity = quantity;

        craftParameters = null;

        this.isLocked = isLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (slot != item.slot) return false;
        if (id != item.id) return false;
        if (quality != item.quality) return false;
        if (hitPoints != item.hitPoints) return false;
        if (quantity != item.quantity) return false;
        if (isLocked != item.isLocked) return false;
        if (!name.equals(item.name)) return false;
        return craftParameters != null ? craftParameters.equals(item.craftParameters) : item.craftParameters == null;

    }

    @Override
    public int hashCode() {
        int result = (int) slot;
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) quality;
        result = 31 * result + (int) hitPoints;
        result = 31 * result + quantity;
        result = 31 * result + (craftParameters != null ? craftParameters.hashCode() : 0);
        result = 31 * result + (isLocked ? 1 : 0);
        return result;
    }
}