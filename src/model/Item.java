package model;

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

    private boolean isCrafted;
    private CraftedItem craftParametrs;

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
        return isCrafted;
    }
    public CraftedItem getCraftParametrs() {
        return craftParametrs;
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
    public void setCraftParametrs(CraftedItem craftParametrs) {
        isCrafted = true;
        this.craftParametrs = craftParametrs;
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

        isCrafted = false;
        craftParametrs = null;

        this.isLocked = isLocked;
    }
}