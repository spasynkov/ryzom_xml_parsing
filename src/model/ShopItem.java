package model;

/**
 * Represents information about items in resale
 */
public class ShopItem {
    private short id;
    private String continent;
    private short price;
    private byte retirePrice;
    private short quantity;     // stack
    private long time;          // timestamp
    private Item item;

    public ShopItem() {
    }

    public ShopItem(short id, String continent, short price, byte retirePrice, short quantity, long time, Item item) {
        this.id = id;
        this.continent = continent;
        this.price = price;
        this.retirePrice = retirePrice;
        this.quantity = quantity;
        this.time = time;
        this.item = item;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public byte getRetirePrice() {
        return retirePrice;
    }

    public void setRetirePrice(byte retirePrice) {
        this.retirePrice = retirePrice;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopItem shopItem = (ShopItem) o;

        if (id != shopItem.id) return false;
        if (price != shopItem.price) return false;
        if (retirePrice != shopItem.retirePrice) return false;
        if (quantity != shopItem.quantity) return false;
        if (time != shopItem.time) return false;
        if (!continent.equals(shopItem.continent)) return false;
        return item.equals(shopItem.item);

    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + continent.hashCode();
        result = 31 * result + (int) price;
        result = 31 * result + (int) retirePrice;
        result = 31 * result + (int) quantity;
        result = 31 * result + (int) (time ^ (time >>> 32));
        result = 31 * result + item.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\tShopItem{" +
                "\n\t\tid=" + id +
                ", \n\t\tcontinent='" + continent + '\'' +
                ", \n\t\tprice=" + price +
                ", \n\t\tretirePrice=" + retirePrice +
                ", \n\t\tquantity=" + quantity +
                ", \n\t\ttime=" + time +
                ", \n\t\titem=" + item +
                "\n\t}\n";
    }
}
