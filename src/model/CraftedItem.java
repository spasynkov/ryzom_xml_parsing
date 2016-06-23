package model;

/**
 * Represents crafting characteristics of some item
 */
public class CraftedItem {

    private Value durability;
    private Value weight;
    private float stateEnergy;

    private Value dodgeModifier;
    private Value parryModifier;

    private short hpBoost;
    private short sapBoost;
    private short staminaBoost;
    private short focusBoost;

    private boolean isWeapon;
    private Value sapLoad;
    private Value damage;
    private Value speed;
    private Value adversaryDodgeModifier;
    private Value adversaryParryModifier;

    private boolean isArmor;
    private boolean isJewel;

    private Protection protection1;
    private Protection protection2;
    private Protection protection3;

    private Value desertResistanceFactor;
    private Value forestResistanceFactor;
    private Value lakesResistanceFactor;
    private Value jungleResistanceFactor;
    private Value primaryRootsResistanceFactor;

    private String color;


    public CraftedItem() {
    }

    public CraftedItem(Value durability, Value weight, float stateEnergy, Value dodgeModifier, Value parryModifier, short hpBoost, short sapBoost, short staminaBoost, short focusBoost, boolean isWeapon, Value sapLoad, Value damage, Value speed, Value adversaryDodgeModifier, Value adversaryParryModifier, boolean isArmor, boolean isJewel, Protection protection1, Protection protection2, Protection protection3, Value desertResistanceFactor, Value forestResistanceFactor, Value lakesResistanceFactor, Value jungleResistanceFactor, Value primaryRootsResistanceFactor, byte color) {
        this.durability = durability;
        this.weight = weight;
        this.stateEnergy = stateEnergy;
        this.dodgeModifier = dodgeModifier;
        this.parryModifier = parryModifier;
        this.hpBoost = hpBoost;
        this.sapBoost = sapBoost;
        this.staminaBoost = staminaBoost;
        this.focusBoost = focusBoost;
        this.isWeapon = isWeapon;
        this.sapLoad = sapLoad;
        this.damage = damage;
        this.speed = speed;
        this.adversaryDodgeModifier = adversaryDodgeModifier;
        this.adversaryParryModifier = adversaryParryModifier;
        this.isArmor = isArmor;
        this.isJewel = isJewel;
        this.protection1 = protection1;
        this.protection2 = protection2;
        this.protection3 = protection3;
        this.desertResistanceFactor = desertResistanceFactor;
        this.forestResistanceFactor = forestResistanceFactor;
        this.lakesResistanceFactor = lakesResistanceFactor;
        this.jungleResistanceFactor = jungleResistanceFactor;
        this.primaryRootsResistanceFactor = primaryRootsResistanceFactor;
        this.color = ItemsColors.getColorById(color);
    }

    public Value getDurability() {
        return durability;
    }

    public void setDurability(Value durability) {
        this.durability = durability;
    }

    public Value getWeight() {
        return weight;
    }

    public void setWeight(Value weight) {
        this.weight = weight;
    }

    public float getStateEnergy() {
        return stateEnergy;
    }

    public void setStateEnergy(float stateEnergy) {
        this.stateEnergy = stateEnergy;
    }

    public Value getDodgeModifier() {
        return dodgeModifier;
    }

    public void setDodgeModifier(Value dodgeModifier) {
        this.dodgeModifier = dodgeModifier;
    }

    public Value getParryModifier() {
        return parryModifier;
    }

    public void setParryModifier(Value parryModifier) {
        this.parryModifier = parryModifier;
    }

    public short getHpBoost() {
        return hpBoost;
    }

    public void setHpBoost(short hpBoost) {
        this.hpBoost = hpBoost;
    }

    public short getSapBoost() {
        return sapBoost;
    }

    public void setSapBoost(short sapBoost) {
        this.sapBoost = sapBoost;
    }

    public short getStaminaBoost() {
        return staminaBoost;
    }

    public void setStaminaBoost(short staminaBoost) {
        this.staminaBoost = staminaBoost;
    }

    public short getFocusBoost() {
        return focusBoost;
    }

    public void setFocusBoost(short focusBoost) {
        this.focusBoost = focusBoost;
    }

    public boolean isWeapon() {
        return isWeapon;
    }

    public void setWeapon(boolean weapon) {
        isWeapon = weapon;
    }

    public Value getSapLoad() {
        return sapLoad;
    }

    public void setSapLoad(Value sapLoad) {
        this.sapLoad = sapLoad;
    }

    public Value getDamage() {
        return damage;
    }

    public void setDamage(Value damage) {
        this.damage = damage;
    }

    public Value getSpeed() {
        return speed;
    }

    public void setSpeed(Value speed) {
        this.speed = speed;
    }

    public Value getAdversaryDodgeModifier() {
        return adversaryDodgeModifier;
    }

    public void setAdversaryDodgeModifier(Value adversaryDodgeModifier) {
        this.adversaryDodgeModifier = adversaryDodgeModifier;
    }

    public Value getAdversaryParryModifier() {
        return adversaryParryModifier;
    }

    public void setAdversaryParryModifier(Value adversaryParryModifier) {
        this.adversaryParryModifier = adversaryParryModifier;
    }

    public boolean isArmor() {
        return isArmor;
    }

    public void setArmor(boolean armor) {
        isArmor = armor;
    }

    public boolean isJewel() {
        return isJewel;
    }

    public void setJewel(boolean jewel) {
        isJewel = jewel;
    }

    public Protection getProtection1() {
        return protection1;
    }

    public void setProtection1(Protection protection1) {
        this.protection1 = protection1;
    }

    public Protection getProtection2() {
        return protection2;
    }

    public void setProtection2(Protection protection2) {
        this.protection2 = protection2;
    }

    public Protection getProtection3() {
        return protection3;
    }

    public void setProtection3(Protection protection3) {
        this.protection3 = protection3;
    }

    public Value getDesertResistanceFactor() {
        return desertResistanceFactor;
    }

    public void setDesertResistanceFactor(Value desertResistanceFactor) {
        this.desertResistanceFactor = desertResistanceFactor;
    }

    public Value getForestResistanceFactor() {
        return forestResistanceFactor;
    }

    public void setForestResistanceFactor(Value forestResistanceFactor) {
        this.forestResistanceFactor = forestResistanceFactor;
    }

    public Value getLakesResistanceFactor() {
        return lakesResistanceFactor;
    }

    public void setLakesResistanceFactor(Value lakesResistanceFactor) {
        this.lakesResistanceFactor = lakesResistanceFactor;
    }

    public Value getJungleResistanceFactor() {
        return jungleResistanceFactor;
    }

    public void setJungleResistanceFactor(Value jungleResistanceFactor) {
        this.jungleResistanceFactor = jungleResistanceFactor;
    }

    public Value getPrimaryRootsResistanceFactor() {
        return primaryRootsResistanceFactor;
    }

    public void setPrimaryRootsResistanceFactor(Value primaryRootsResistanceFactor) {
        this.primaryRootsResistanceFactor = primaryRootsResistanceFactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public class Value {
        private float inGameValue;
        private float realValue;

        public float getInGameValue() {
            return inGameValue;
        }

        public void setInGameValue(float inGameValue) {
            this.inGameValue = inGameValue;
        }

        public float getRealValue() {
            return realValue;
        }

        public void setRealValue(float realValue) {
            this.realValue = realValue;
        }

        public Value() {
        }

        public Value(float inGameValue, float realValue) {
            this.inGameValue = inGameValue;
            this.realValue = realValue;
        }
    }

    public class Protection {
        private String type;
        private Value value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        public Protection() {
        }

        public Protection(String type, Value value) {
            this.type = type;
            this.value = value;
        }
    }
}
