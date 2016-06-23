package model;

/**
 * Simple class for saving x/y/z position of characters/animals on the map
 */
public class PositionOnMap {
    private int x;
    private int y;
    private int z;

    public PositionOnMap() {
    }

    public PositionOnMap(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionOnMap that = (PositionOnMap) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "xyz=(" + x + y + z + ")" +
                "}\n";
    }
}
