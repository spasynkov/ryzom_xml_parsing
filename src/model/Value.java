package model;

/**
 * Class for saving pairs of ingame value and real value
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Value value = (Value) o;

        if (Float.compare(value.inGameValue, inGameValue) != 0) return false;
        return Float.compare(value.realValue, realValue) == 0;

    }

    @Override
    public int hashCode() {
        int result = (inGameValue != +0.0f ? Float.floatToIntBits(inGameValue) : 0);
        result = 31 * result + (realValue != +0.0f ? Float.floatToIntBits(realValue) : 0);
        return result;
    }

    @Override
    public String toString() {
        return inGameValue + "(" + realValue + ")";
    }
}
