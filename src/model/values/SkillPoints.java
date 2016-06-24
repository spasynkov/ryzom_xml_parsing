package model.values;

/**
 * Class for representing pair of values of skill points
 */
public class SkillPoints {
    private int spent;
    private int available;
    private String skillName;

    public SkillPoints() {
        skillName = ""; // should not be null
    }

    public SkillPoints(int spent, int available, String skillName) {
        this.spent = spent;
        this.available = available;
        this.skillName = skillName;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkillPoints that = (SkillPoints) o;

        if (spent != that.spent) return false;
        if (available != that.available) return false;
        return skillName.equals(that.skillName);

    }

    @Override
    public int hashCode() {
        int result = spent;
        result = 31 * result + available;
        result = 31 * result + skillName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return skillName + "(" +
                "spent: " + spent +
                ", available: " + available +
                ")\n";
    }
}
