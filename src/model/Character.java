package model;

import java.util.List;

/**
 * Represents all character's info
 */
public class Character {
    private String apiKey;
    private long created;
    private long cashedUntil;
    private String modules;

    private int id;
    private String name;
    private String shard;
    private List<Item> bag;
    private long money;
    private List<Item> apartments;
    private List<ShopItem> resale;
    private List<Animal> pets;

    public Character() {
    }

    public Character(String apiKey, long created, long cashedUntil, String modules, int id, String name, String shard, List<Item> bag, long money, List<Item> apartments, List<ShopItem> resale, List<Animal> pets) {
        this.apiKey = apiKey;
        this.created = created;
        this.cashedUntil = cashedUntil;
        this.modules = modules;
        this.id = id;
        this.name = name;
        this.shard = shard;
        this.bag = bag;
        this.money = money;
        this.apartments = apartments;
        this.resale = resale;
        this.pets = pets;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getCashedUntil() {
        return cashedUntil;
    }

    public void setCashedUntil(long cashedUntil) {
        this.cashedUntil = cashedUntil;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShard() {
        return shard;
    }

    public void setShard(String shard) {
        this.shard = shard;
    }

    public List<Item> getBag() {
        return bag;
    }

    public void setBag(List<Item> bag) {
        this.bag = bag;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public List<Item> getApartments() {
        return apartments;
    }

    public void setApartments(List<Item> apartments) {
        this.apartments = apartments;
    }

    public List<ShopItem> getResale() {
        return resale;
    }

    public void setResale(List<ShopItem> resale) {
        this.resale = resale;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (created != character.created) return false;
        if (cashedUntil != character.cashedUntil) return false;
        if (id != character.id) return false;
        if (money != character.money) return false;
        if (!apiKey.equals(character.apiKey)) return false;
        if (!modules.equals(character.modules)) return false;
        if (!name.equals(character.name)) return false;
        if (!shard.equals(character.shard)) return false;
        if (!bag.equals(character.bag)) return false;
        if (!apartments.equals(character.apartments)) return false;
        if (!resale.equals(character.resale)) return false;
        return pets.equals(character.pets);

    }

    @Override
    public int hashCode() {
        int result = apiKey.hashCode();
        result = 31 * result + (int) (created ^ (created >>> 32));
        result = 31 * result + (int) (cashedUntil ^ (cashedUntil >>> 32));
        result = 31 * result + modules.hashCode();
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        result = 31 * result + shard.hashCode();
        result = 31 * result + bag.hashCode();
        result = 31 * result + (int) (money ^ (money >>> 32));
        result = 31 * result + apartments.hashCode();
        result = 31 * result + resale.hashCode();
        result = 31 * result + pets.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "\n\tapiKey='" + apiKey + '\'' +
                ", \n\tcreated=" + created +
                ", \n\tcashedUntil=" + cashedUntil +
                ", \n\tmodules='" + modules + '\'' +
                ", \n\tid=" + id +
                ", \n\tname='" + name + '\'' +
                ", \n\tshard='" + shard + '\'' +
                ", \n\tbag=" + bag +
                ", \n\tmoney=" + money +
                ", \n\tapartments=" + apartments +
                ", \n\tresale=" + resale +
                ", \n\tpets=" + pets +
                "\n}";
    }
}
