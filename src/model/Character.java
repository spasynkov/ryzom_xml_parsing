package model;

import exceptions.BagIsNotAvailableException;
import exceptions.ItemIsNotCraftedException;
import exceptions.NoSuchEquipmentItemName;
import exceptions.NoSuchItemInTheBagException;
import utils.DateFormatter;

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
    private String race;
    private String gender;          // m - male, f - female
    private String title;

    // allegiance
    private String cult;
    private String civilization;

    private Played played;
    private BodyInfo body;
    private CharactersGuild guild;

    // equipment
    private EquipmentItem chest;        // vest
    private EquipmentItem legs;         // pants/skirt
    private EquipmentItem feet;         // boots
    private EquipmentItem arms;         // sleeves
    private EquipmentItem hands;        // gloves
    private EquipmentItem handl;        // weapon in left hand
    private EquipmentItem handr;        // weapon in right hand
    private EquipmentItem wristl;       // bracelet left
    private EquipmentItem wristr;       // bracelet right
    private EquipmentItem earl;         // earring left
    private EquipmentItem earr;         // earring right
    private EquipmentItem fingerl;      // ring left
    private EquipmentItem fingerr;      // ring right
    private EquipmentItem anklel;       // anklet left
    private EquipmentItem ankler;       // anklet right
    private EquipmentItem headdress;    // diadem
    private EquipmentItem necklace;     // pendant

    private PositionOnMap position;
    private Stats stats;                // hp/sap/stamina/focus

    private List<Item> bag;
    private Long money;
    private List<Item> apartments;
    private List<ShopItem> resale;
    private List<Animal> pets;

    private SkillsTree skills;

    private FactionAndPvpPoints factionAndPvpPoints;

    private Value fightSkillPoints;     // free/spent
    private Value magicSkillPoints;     // free/spent
    private Value craftSkillPoints;     // free/spent
    private Value harvestSkillPoints;   // free/spent

    private List<Occupation> occupations;

    public Character() {
    }

    public Character(String apiKey, long created, long cashedUntil, String modules, int id, String name, String shard, String race, String gender, String title, String cult, String civilization, Played played, BodyInfo body, CharactersGuild guild, EquipmentItem chest, EquipmentItem legs, EquipmentItem feet, EquipmentItem arms, EquipmentItem hands, EquipmentItem handl, EquipmentItem handr, EquipmentItem wristl, EquipmentItem wristr, EquipmentItem earl, EquipmentItem earr, EquipmentItem fingerl, EquipmentItem fingerr, EquipmentItem anklel, EquipmentItem ankler, EquipmentItem headdress, EquipmentItem necklace, PositionOnMap position, Stats stats, List<Item> bag, Long money, List<Item> apartments, List<ShopItem> resale, List<Animal> pets, SkillsTree skills, FactionAndPvpPoints factionAndPvpPoints, Value fightSkillPoints, Value magicSkillPoints, Value craftSkillPoints, Value harvestSkillPoints, List<Occupation> occupations) {
        this.apiKey = apiKey;
        this.created = created;
        this.cashedUntil = cashedUntil;
        this.modules = modules;
        this.id = id;
        this.name = name;
        this.shard = shard;
        this.race = race;
        this.gender = gender;
        this.title = title;
        this.cult = cult;
        this.civilization = civilization;
        this.played = played;
        this.body = body;
        this.guild = guild;
        this.chest = chest;
        this.legs = legs;
        this.feet = feet;
        this.arms = arms;
        this.hands = hands;
        this.handl = handl;
        this.handr = handr;
        this.wristl = wristl;
        this.wristr = wristr;
        this.earl = earl;
        this.earr = earr;
        this.fingerl = fingerl;
        this.fingerr = fingerr;
        this.anklel = anklel;
        this.ankler = ankler;
        this.headdress = headdress;
        this.necklace = necklace;
        this.position = position;
        this.stats = stats;
        this.bag = bag;
        this.money = money;
        this.apartments = apartments;
        this.resale = resale;
        this.pets = pets;
        this.skills = skills;
        this.factionAndPvpPoints = factionAndPvpPoints;
        this.fightSkillPoints = fightSkillPoints;
        this.magicSkillPoints = magicSkillPoints;
        this.craftSkillPoints = craftSkillPoints;
        this.harvestSkillPoints = harvestSkillPoints;
        this.occupations = occupations;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCult() {
        return cult;
    }

    public void setCult(String cult) {
        this.cult = cult;
    }

    public String getCivilization() {
        return civilization;
    }

    public void setCivilization(String civilization) {
        this.civilization = civilization;
    }

    public Played getPlayed() {
        return played;
    }

    public void setPlayed(Played played) {
        this.played = played;
    }

    public EquipmentItem getChest() {
        return chest;
    }

    public void setChest(EquipmentItem chest) {
        this.chest = chest;
    }

    public EquipmentItem getLegs() {
        return legs;
    }

    public void setLegs(EquipmentItem legs) {
        this.legs = legs;
    }

    public EquipmentItem getFeet() {
        return feet;
    }

    public void setFeet(EquipmentItem feet) {
        this.feet = feet;
    }

    public EquipmentItem getArms() {
        return arms;
    }

    public void setArms(EquipmentItem arms) {
        this.arms = arms;
    }

    public EquipmentItem getHands() {
        return hands;
    }

    public void setHands(EquipmentItem hands) {
        this.hands = hands;
    }

    public EquipmentItem getHandl() {
        return handl;
    }

    public void setHandl(EquipmentItem handl) {
        this.handl = handl;
    }

    public EquipmentItem getHandr() {
        return handr;
    }

    public void setHandr(EquipmentItem handr) {
        this.handr = handr;
    }

    public EquipmentItem getWristl() {
        return wristl;
    }

    public void setWristl(EquipmentItem wristl) {
        this.wristl = wristl;
    }

    public EquipmentItem getWristr() {
        return wristr;
    }

    public void setWristr(EquipmentItem wristr) {
        this.wristr = wristr;
    }

    public EquipmentItem getEarl() {
        return earl;
    }

    public void setEarl(EquipmentItem earl) {
        this.earl = earl;
    }

    public EquipmentItem getEarr() {
        return earr;
    }

    public void setEarr(EquipmentItem earr) {
        this.earr = earr;
    }

    public EquipmentItem getFingerl() {
        return fingerl;
    }

    public void setFingerl(EquipmentItem fingerl) {
        this.fingerl = fingerl;
    }

    public EquipmentItem getFingerr() {
        return fingerr;
    }

    public void setFingerr(EquipmentItem fingerr) {
        this.fingerr = fingerr;
    }

    public EquipmentItem getAnklel() {
        return anklel;
    }

    public void setAnklel(EquipmentItem anklel) {
        this.anklel = anklel;
    }

    public EquipmentItem getAnkler() {
        return ankler;
    }

    public void setAnkler(EquipmentItem ankler) {
        this.ankler = ankler;
    }

    public EquipmentItem getHeaddress() {
        return headdress;
    }

    public void setHeaddress(EquipmentItem headdress) {
        this.headdress = headdress;
    }

    public EquipmentItem getNecklace() {
        return necklace;
    }

    public void setNecklace(EquipmentItem necklace) {
        this.necklace = necklace;
    }

    public PositionOnMap getPosition() {
        return position;
    }

    public void setPosition(PositionOnMap position) {
        this.position = position;
    }

    public List<Item> getBag() {
        return bag;
    }

    public void setBag(List<Item> bag) {
        this.bag = bag;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
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

    public SkillsTree getSkills() {
        return skills;
    }

    public void setSkills(SkillsTree skills) {
        this.skills = skills;
    }

    public Value getFightSkillPoints() {
        return fightSkillPoints;
    }

    public void setFightSkillPoints(Value fightSkillPoints) {
        this.fightSkillPoints = fightSkillPoints;
    }

    public Value getMagicSkillPoints() {
        return magicSkillPoints;
    }

    public void setMagicSkillPoints(Value magicSkillPoints) {
        this.magicSkillPoints = magicSkillPoints;
    }

    public Value getCraftSkillPoints() {
        return craftSkillPoints;
    }

    public void setCraftSkillPoints(Value craftSkillPoints) {
        this.craftSkillPoints = craftSkillPoints;
    }

    public Value getHarvestSkillPoints() {
        return harvestSkillPoints;
    }

    public void setHarvestSkillPoints(Value harvestSkillPoints) {
        this.harvestSkillPoints = harvestSkillPoints;
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }

    public void addEquipmentItem(String equipmentItemName, int slot) throws BagIsNotAvailableException, NoSuchItemInTheBagException, NoSuchEquipmentItemName, ItemIsNotCraftedException {
        if (bag != null) throw new BagIsNotAvailableException("Can't get access to character's bag. Try to set bag before, or use addEquipmentItem(String equipmentItemName, int slot, int quality, int color) method to add item manually");
        EquipmentItem item = new EquipmentItem((short)slot);
        setEquipmentItemByName(equipmentItemName, item);
    }

    public void addEquipmentItem(String equipmentItemName, int slot, int quality, int color) throws NoSuchEquipmentItemName {
        EquipmentItem item = new EquipmentItem((short)slot, (short)quality, ItemsColors.getColorById((byte)color));
        setEquipmentItemByName(equipmentItemName, item);
    }

    private void setEquipmentItemByName(String equipmentItemName, EquipmentItem item) throws NoSuchEquipmentItemName {
        switch (equipmentItemName) {
            case "chest" : {
                this.chest = item;
                break;
            }
            case "legs" : {
                this.legs = item;
                break;
            }
            case "feet" : {
                this.feet = item;
                break;
            }
            case "arms" : {
                this.arms = item;
                break;
            }
            case "hands" : {
                this.hands = item;
                break;
            }
            case "handl" : {
                this.handl = item;
                break;
            }
            case "handr" : {
                this.handr = item;
                break;
            }
            case "wristl" : {
                this.wristl = item;
                break;
            }
            case "wristr" : {
                this.wristr = item;
                break;
            }
            case "earl" : {
                this.earl = item;
                break;
            }
            case "earr" : {
                this.earr = item;
                break;
            }
            case "fingerl" : {
                this.fingerl = item;
                break;
            }
            case "fingerr" : {
                this.fingerr = item;
                break;
            }
            case "anklel" : {
                this.anklel = item;
                break;
            }
            case "ankler" : {
                this.ankler = item;
                break;
            }
            case "headdress" : {
                this.headdress = item;
                break;
            }
            case "necklace" : {
                this.necklace = item;
                break;
            }
            default: throw new NoSuchEquipmentItemName("Can't find eqipment item with name: " + equipmentItemName + ". Check spelling please.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (created != character.created) return false;
        if (cashedUntil != character.cashedUntil) return false;
        if (id != character.id) return false;
        if (!apiKey.equals(character.apiKey)) return false;
        if (!modules.equals(character.modules)) return false;
        if (!name.equals(character.name)) return false;
        if (!shard.equals(character.shard)) return false;
        if (race != null ? !race.equals(character.race) : character.race != null) return false;
        if (gender != null ? !gender.equals(character.gender) : character.gender != null) return false;
        if (title != null ? !title.equals(character.title) : character.title != null) return false;
        if (cult != null ? !cult.equals(character.cult) : character.cult != null) return false;
        if (civilization != null ? !civilization.equals(character.civilization) : character.civilization != null)
            return false;
        if (played != null ? !played.equals(character.played) : character.played != null) return false;
        if (chest != null ? !chest.equals(character.chest) : character.chest != null) return false;
        if (legs != null ? !legs.equals(character.legs) : character.legs != null) return false;
        if (feet != null ? !feet.equals(character.feet) : character.feet != null) return false;
        if (arms != null ? !arms.equals(character.arms) : character.arms != null) return false;
        if (hands != null ? !hands.equals(character.hands) : character.hands != null) return false;
        if (handl != null ? !handl.equals(character.handl) : character.handl != null) return false;
        if (handr != null ? !handr.equals(character.handr) : character.handr != null) return false;
        if (wristl != null ? !wristl.equals(character.wristl) : character.wristl != null) return false;
        if (wristr != null ? !wristr.equals(character.wristr) : character.wristr != null) return false;
        if (earl != null ? !earl.equals(character.earl) : character.earl != null) return false;
        if (earr != null ? !earr.equals(character.earr) : character.earr != null) return false;
        if (fingerl != null ? !fingerl.equals(character.fingerl) : character.fingerl != null) return false;
        if (fingerr != null ? !fingerr.equals(character.fingerr) : character.fingerr != null) return false;
        if (anklel != null ? !anklel.equals(character.anklel) : character.anklel != null) return false;
        if (ankler != null ? !ankler.equals(character.ankler) : character.ankler != null) return false;
        if (headdress != null ? !headdress.equals(character.headdress) : character.headdress != null) return false;
        if (necklace != null ? !necklace.equals(character.necklace) : character.necklace != null) return false;
        if (position != null ? !position.equals(character.position) : character.position != null) return false;
        if (bag != null ? !bag.equals(character.bag) : character.bag != null) return false;
        if (money != null ? !money.equals(character.money) : character.money != null) return false;
        if (apartments != null ? !apartments.equals(character.apartments) : character.apartments != null) return false;
        if (resale != null ? !resale.equals(character.resale) : character.resale != null) return false;
        if (pets != null ? !pets.equals(character.pets) : character.pets != null) return false;
        if (skills != null ? !skills.equals(character.skills) : character.skills != null) return false;
        if (fightSkillPoints != null ? !fightSkillPoints.equals(character.fightSkillPoints) : character.fightSkillPoints != null)
            return false;
        if (magicSkillPoints != null ? !magicSkillPoints.equals(character.magicSkillPoints) : character.magicSkillPoints != null)
            return false;
        if (craftSkillPoints != null ? !craftSkillPoints.equals(character.craftSkillPoints) : character.craftSkillPoints != null)
            return false;
        if (harvestSkillPoints != null ? !harvestSkillPoints.equals(character.harvestSkillPoints) : character.harvestSkillPoints != null)
            return false;
        return occupations != null ? occupations.equals(character.occupations) : character.occupations == null;

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
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (cult != null ? cult.hashCode() : 0);
        result = 31 * result + (civilization != null ? civilization.hashCode() : 0);
        result = 31 * result + (played != null ? played.hashCode() : 0);
        result = 31 * result + (chest != null ? chest.hashCode() : 0);
        result = 31 * result + (legs != null ? legs.hashCode() : 0);
        result = 31 * result + (feet != null ? feet.hashCode() : 0);
        result = 31 * result + (arms != null ? arms.hashCode() : 0);
        result = 31 * result + (hands != null ? hands.hashCode() : 0);
        result = 31 * result + (handl != null ? handl.hashCode() : 0);
        result = 31 * result + (handr != null ? handr.hashCode() : 0);
        result = 31 * result + (wristl != null ? wristl.hashCode() : 0);
        result = 31 * result + (wristr != null ? wristr.hashCode() : 0);
        result = 31 * result + (earl != null ? earl.hashCode() : 0);
        result = 31 * result + (earr != null ? earr.hashCode() : 0);
        result = 31 * result + (fingerl != null ? fingerl.hashCode() : 0);
        result = 31 * result + (fingerr != null ? fingerr.hashCode() : 0);
        result = 31 * result + (anklel != null ? anklel.hashCode() : 0);
        result = 31 * result + (ankler != null ? ankler.hashCode() : 0);
        result = 31 * result + (headdress != null ? headdress.hashCode() : 0);
        result = 31 * result + (necklace != null ? necklace.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (bag != null ? bag.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (apartments != null ? apartments.hashCode() : 0);
        result = 31 * result + (resale != null ? resale.hashCode() : 0);
        result = 31 * result + (pets != null ? pets.hashCode() : 0);
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + (fightSkillPoints != null ? fightSkillPoints.hashCode() : 0);
        result = 31 * result + (magicSkillPoints != null ? magicSkillPoints.hashCode() : 0);
        result = 31 * result + (craftSkillPoints != null ? craftSkillPoints.hashCode() : 0);
        result = 31 * result + (harvestSkillPoints != null ? harvestSkillPoints.hashCode() : 0);
        result = 31 * result + (occupations != null ? occupations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "\n\tapiKey='" + apiKey + '\'' +
                "\n\tcreated/cashed until (in UTC): " + DateFormatter.getShortDateAndTimeInUtc(created * 1000) + " / " + DateFormatter.getShortDateAndTimeInUtc(cashedUntil * 1000) +
                "\n\tmodules='" + modules + '\'' +
                "\n\tid=" + id +
                "\n\tname='" + name + '\'' +
                "\n\tshard='" + shard + '\'' +
                ((race != null) ? "\n\trace='" + race + '\'' : "") +
                ((gender != null) ? "\n\tgender='" + gender + '\'' : "") +
                ((title != null) ? "\n\ttitle='" + title + '\'' : "") +
                ((cult != null) ? "\n\tcult='" + cult + '\'' : "") +
                ((civilization != null) ? "\n\tcivilization='" + civilization + '\'' : "") +
                ((played != null) ? "\n\tplayed=" + played : "") +
                ((body != null) ? body : "") +
                ((guild != null) ? guild : "") +
                ((chest != null) ? "\n\tchest=" + chest : "") +
                ((legs != null) ? "\n\tlegs=" + legs : "") +
                ((feet != null) ? "\n\tfeet=" + feet : "") +
                ((arms != null) ? "\n\tarms=" + arms : "") +
                ((hands != null) ? "\n\thands=" + hands : "") +
                ((handl != null) ? "\n\thandl=" + handl : "") +
                ((handr != null) ? "\n\thandr=" + handr : "") +
                ((wristl != null) ? "\n\twristl=" + wristl : "") +
                ((wristr != null) ? "\n\twristr=" + wristr : "") +
                ((earl != null) ? "\n\tearl=" + earl : "") +
                ((earr != null) ? "\n\tearr=" + earr : "") +
                ((fingerl != null) ? "\n\tfingerl=" + fingerl : "") +
                ((fingerr != null) ? "\n\tfingerr=" + fingerr : "") +
                ((anklel != null) ? "\n\tanklel=" + anklel : "") +
                ((ankler != null) ? "\n\tankler=" + ankler : "") +
                ((headdress != null) ? "\n\theaddress=" + headdress : "") +
                ((necklace != null) ? "\n\tnecklace=" + necklace : "") +
                ((position != null) ? "\n\tposition=" + position : "") +
                ((stats != null) ? "\n\tstats: " + stats : "") +
                ((bag != null) ? bag : "") +
                ((money != null) ? "\n\tmoney=" + String.format("%,d", money) : "") +
                ((apartments != null) ? apartments : "") +
                ((resale != null) ? resale : "") +
                ((pets != null) ? pets : "") +
                ((skills != null) ? skills : "") +
                ((factionAndPvpPoints != null) ? factionAndPvpPoints : "") +
                ((fightSkillPoints != null) ? ", fightSkillPoints=" + fightSkillPoints : "") +
                ((magicSkillPoints != null) ? ", magicSkillPoints=" + magicSkillPoints : "") +
                ((craftSkillPoints != null) ? ", craftSkillPoints=" + craftSkillPoints : "") +
                ((harvestSkillPoints != null) ? ", harvestSkillPoints=" + harvestSkillPoints : "") +
                ((occupations != null) ? occupations : "") +
                "\n}";
    }

    public class Played {
        private long lastLogin;
        private long lastLogout;
        private long daysPlayed;

        public Played() {
        }

        public Played(long lastLogin, long lastLogout, long daysPlayed) {
            this.lastLogin = lastLogin;
            this.lastLogout = lastLogout;
            this.daysPlayed = daysPlayed;
        }

        public long getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(long lastLogin) {
            this.lastLogin = lastLogin;
        }

        public long getLastLogout() {
            return lastLogout;
        }

        public void setLastLogout(long lastLogout) {
            this.lastLogout = lastLogout;
        }

        public long getDaysPlayed() {
            return daysPlayed;
        }

        public void setDaysPlayed(long daysPlayed) {
            this.daysPlayed = daysPlayed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Played played = (Played) o;

            if (lastLogin != played.lastLogin) return false;
            if (lastLogout != played.lastLogout) return false;
            return daysPlayed == played.daysPlayed;

        }

        @Override
        public int hashCode() {
            int result = (int) (lastLogin ^ (lastLogin >>> 32));
            result = 31 * result + (int) (lastLogout ^ (lastLogout >>> 32));
            result = 31 * result + (int) (daysPlayed ^ (daysPlayed >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "\tPlayed{" +
                    "lastLogin=" + lastLogin +
                    ", lastLogout=" + lastLogout +
                    ", daysPlayed=" + daysPlayed +
                    "}\n";
        }
    }
    
    public class Stats {
        // stats
        private short constitution;
        private short metabolism;
        private short intelligence;
        private short wisdom;
        private short strength;
        private short balance;
        private short dexterity;
        private short will;

        private Value hp;           // base/real
        private Value stamina;      // base/real
        private Value sap;          // base/real
        private Value focus;        // base/real

        public Stats() {
        }

        public Stats(int constitution, int metabolism, int intelligence, int wisdom, int strength, int balance, int dexterity, int will, Value hp, Value stamina, Value sap, Value focus) {
            this.constitution = (short) constitution;
            this.metabolism = (short) metabolism;
            this.intelligence = (short) intelligence;
            this.wisdom = (short) wisdom;
            this.strength = (short) strength;
            this.balance = (short) balance;
            this.dexterity = (short) dexterity;
            this.will = (short) will;
            this.hp = hp;
            this.stamina = stamina;
            this.sap = sap;
            this.focus = focus;
        }

        public void setStats(int constitution, int metabolism, int intelligence, int wisdom, int strength, int balance, int dexterity, int will) {
            this.constitution = (short) constitution;
            this.metabolism = (short) metabolism;
            this.intelligence = (short) intelligence;
            this.wisdom = (short) wisdom;
            this.strength = (short) strength;
            this.balance = (short) balance;
            this.dexterity = (short) dexterity;
            this.will = (short) will;
        }

        public void setBars(Value hp, Value stamina, Value sap, Value focus) {
            this.hp = hp;
            this.stamina = stamina;
            this.sap = sap;
            this.focus = focus;
        }

        public short getConstitution() {
            return constitution;
        }

        public void setConstitution(short constitution) {
            this.constitution = constitution;
        }

        public short getMetabolism() {
            return metabolism;
        }

        public void setMetabolism(short metabolism) {
            this.metabolism = metabolism;
        }

        public short getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(short intelligence) {
            this.intelligence = intelligence;
        }

        public short getWisdom() {
            return wisdom;
        }

        public void setWisdom(short wisdom) {
            this.wisdom = wisdom;
        }

        public short getStrength() {
            return strength;
        }

        public void setStrength(short strength) {
            this.strength = strength;
        }

        public short getBalance() {
            return balance;
        }

        public void setBalance(short balance) {
            this.balance = balance;
        }

        public short getDexterity() {
            return dexterity;
        }

        public void setDexterity(short dexterity) {
            this.dexterity = dexterity;
        }

        public short getWill() {
            return will;
        }

        public void setWill(short will) {
            this.will = will;
        }

        public Value getHp() {
            return hp;
        }

        public void setHp(Value hp) {
            this.hp = hp;
        }

        public Value getStamina() {
            return stamina;
        }

        public void setStamina(Value stamina) {
            this.stamina = stamina;
        }

        public Value getSap() {
            return sap;
        }

        public void setSap(Value sap) {
            this.sap = sap;
        }

        public Value getFocus() {
            return focus;
        }

        public void setFocus(Value focus) {
            this.focus = focus;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Stats stats = (Stats) o;

            if (constitution != stats.constitution) return false;
            if (metabolism != stats.metabolism) return false;
            if (intelligence != stats.intelligence) return false;
            if (wisdom != stats.wisdom) return false;
            if (strength != stats.strength) return false;
            if (balance != stats.balance) return false;
            if (dexterity != stats.dexterity) return false;
            if (will != stats.will) return false;
            if (!hp.equals(stats.hp)) return false;
            if (!stamina.equals(stats.stamina)) return false;
            if (!sap.equals(stats.sap)) return false;
            return focus.equals(stats.focus);

        }

        @Override
        public int hashCode() {
            int result = (int) constitution;
            result = 31 * result + (int) metabolism;
            result = 31 * result + (int) intelligence;
            result = 31 * result + (int) wisdom;
            result = 31 * result + (int) strength;
            result = 31 * result + (int) balance;
            result = 31 * result + (int) dexterity;
            result = 31 * result + (int) will;
            result = 31 * result + hp.hashCode();
            result = 31 * result + stamina.hashCode();
            result = 31 * result + sap.hashCode();
            result = 31 * result + focus.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "{" +
                    "\n\t\tconstitution=" + constitution +
                    "\n\t\tmetabolism=" + metabolism +
                    "\n\t\tintelligence=" + intelligence +
                    "\n\t\twisdom=" + wisdom +
                    "\n\t\tstrength=" + strength +
                    "\n\t\tbalance=" + balance +
                    "\n\t\tdexterity=" + dexterity +
                    "\n\t\twill=" + will +
                    "\n\n\t\thp=" + hp +
                    "\n\t\tstamina=" + stamina +
                    "\n\t\tsap=" + sap +
                    "\n\t\tfocus=" + focus +
                    "\n\t}\n";
        }
    }
    
    public class FactionAndPvpPoints {
        private int kami;
        private int karavan;
        private int fyros;
        private int matis;
        private int tryker;
        private int zorai;
        private int pvp;

        public FactionAndPvpPoints() {
        }

        public FactionAndPvpPoints(int kami, int karavan, int fyros, int matis, int tryker, int zorai, int pvp) {
            this.kami = kami;
            this.karavan = karavan;
            this.fyros = fyros;
            this.matis = matis;
            this.tryker = tryker;
            this.zorai = zorai;
            this.pvp = pvp;
        }

        public void setFactionPoints(int kami, int karavan, int fyros, int matis, int tryker, int zorai) {
            this.kami = kami;
            this.karavan = karavan;
            this.fyros = fyros;
            this.matis = matis;
            this.tryker = tryker;
            this.zorai = zorai;
        }

        public int getKami() {
            return kami;
        }

        public void setKami(int kami) {
            this.kami = kami;
        }

        public int getKaravan() {
            return karavan;
        }

        public void setKaravan(int karavan) {
            this.karavan = karavan;
        }

        public int getFyros() {
            return fyros;
        }

        public void setFyros(int fyros) {
            this.fyros = fyros;
        }

        public int getMatis() {
            return matis;
        }

        public void setMatis(int matis) {
            this.matis = matis;
        }

        public int getTryker() {
            return tryker;
        }

        public void setTryker(int tryker) {
            this.tryker = tryker;
        }

        public int getZorai() {
            return zorai;
        }

        public void setZorai(int zorai) {
            this.zorai = zorai;
        }

        public int getPvp() {
            return pvp;
        }

        public void setPvp(int pvp) {
            this.pvp = pvp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FactionAndPvpPoints that = (FactionAndPvpPoints) o;

            if (kami != that.kami) return false;
            if (karavan != that.karavan) return false;
            if (fyros != that.fyros) return false;
            if (matis != that.matis) return false;
            if (tryker != that.tryker) return false;
            if (zorai != that.zorai) return false;
            return pvp == that.pvp;

        }

        @Override
        public int hashCode() {
            int result = kami;
            result = 31 * result + karavan;
            result = 31 * result + fyros;
            result = 31 * result + matis;
            result = 31 * result + tryker;
            result = 31 * result + zorai;
            result = 31 * result + pvp;
            return result;
        }

        @Override
        public String toString() {
            return "FactionPoints{" +
                    "kami=" + kami +
                    ", karavan=" + karavan +
                    ", fyros=" + fyros +
                    ", matis=" + matis +
                    ", tryker=" + tryker +
                    ", zorai=" + zorai +
                    "}" +
                    "\n\tPVP points=" + pvp + "\n";
        }
    }

    public class EquipmentItem {
        private short slotNumber;
        private short quality;
        private String color;

        public short getSlotNumber() {
            return slotNumber;
        }

        public void setSlotNumber(short slotNumber) {
            this.slotNumber = slotNumber;
        }

        public short getQuality() {
            return quality;
        }

        public void setQuality(short quality) {
            this.quality = quality;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public EquipmentItem() {
        }

        public EquipmentItem(short slotNumber) throws NoSuchItemInTheBagException, BagIsNotAvailableException, ItemIsNotCraftedException {
            if (bag != null) {
                for (Item item: bag) {
                    if (item.getSlot() == slotNumber) {
                        this.slotNumber = slotNumber;
                        this.quality = item.getQuality();
                        this.color = item.getCraftParameters().getColor();
                        return;     // item constructed successfully, no need to continue here
                    }
                }
                throw new NoSuchItemInTheBagException("Can't find item №" + slotNumber + " in character's bag while creating equipment item. Check if bag is created already.");
            } else throw new BagIsNotAvailableException("Can't get access to character's bag.  Check if bag is created already.");
        }

        public EquipmentItem(short slotNumber, short quality, String color) {
            this.slotNumber = slotNumber;
            this.quality = quality;
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EquipmentItem that = (EquipmentItem) o;

            if (slotNumber != that.slotNumber) return false;
            if (quality != that.quality) return false;
            return color.equals(that.color);

        }

        @Override
        public int hashCode() {
            int result = (int) slotNumber;
            result = 31 * result + (int) quality;
            result = 31 * result + color.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "\tEquipmentItem{" +
                    "slotNumber=" + slotNumber +
                    ", quality=" + quality +
                    ", color='" + color + '\'' +
                    "}\n";
        }
    }

}
