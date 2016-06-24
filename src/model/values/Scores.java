package model.values;

/**
 * Class for saving pairs of values for character's scores/stats
 */
public class Scores {
    private short base;
    private short real;
    private String scoreName;

    public Scores() {
        scoreName = ""; // should not be null
    }

    public Scores(int base, int real, String scoreName) {
        this.base = (short) base;
        this.real = (short) real;
        this.scoreName = scoreName;
    }

    public short getBase() {
        return base;
    }

    public void setBase(short base) {
        this.base = base;
    }

    public short getReal() {
        return real;
    }

    public void setReal(short real) {
        this.real = real;
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scores scores = (Scores) o;

        if (base != scores.base) return false;
        if (real != scores.real) return false;
        return scoreName.equals(scores.scoreName);

    }

    @Override
    public int hashCode() {
        int result = (int) base;
        result = 31 * result + (int) real;
        result = 31 * result + scoreName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return scoreName + "(" +
                "base=" + base +
                ", real=" + real +
                ")";
    }
}
