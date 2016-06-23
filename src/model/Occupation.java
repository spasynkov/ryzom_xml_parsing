package model;

/**
 * Represents character's occupation stats
 */
public class Occupation {
    private String sheet;       // id/name
    private byte grade;         // echelon
    private short progress;
    private boolean isActive;   // if current occupation is active for character

    public Occupation() {
    }

    public Occupation(String sheet, byte grade, short progress, boolean isActive) {
        this.sheet = sheet;
        this.grade = grade;
        this.progress = progress;
        this.isActive = isActive;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public byte getGrade() {
        return grade;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public short getProgress() {
        return progress;
    }

    public void setProgress(short progress) {
        this.progress = progress;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Occupation that = (Occupation) o;

        if (grade != that.grade) return false;
        if (progress != that.progress) return false;
        if (isActive != that.isActive) return false;
        return sheet.equals(that.sheet);

    }

    @Override
    public int hashCode() {
        int result = sheet.hashCode();
        result = 31 * result + (int) grade;
        result = 31 * result + (int) progress;
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\tOccupation id:'" + sheet + '\'' +
                ", grade=" + grade +
                ", progress=" + progress +
                ", isActive=" + isActive +
                "}\n";
    }
}
