package model;

/**
 * Represent information about character's body/look
 */
public class BodyInfo {
    // body
    private byte hairType;
    private byte hairColor;
    private byte tattoo;
    private byte eyeColor;
    // gabarit
    private byte height;
    private byte torso;
    private byte armsSize;
    private byte legsSize;
    private byte breast;
    // morph
    private byte target1;
    private byte target2;
    private byte target3;
    private byte target4;
    private byte target5;
    private byte target6;
    private byte target7;
    private byte target8;

    public BodyInfo() {
    }

    public BodyInfo(int hairType, int hairColor, int tattoo, int eyeColor, int height, int torso, int armsSize, int legsSize, int breast, int target1, int target2, int target3, int target4, int target5, int target6, int target7, int target8) {
        this.hairType = (byte) hairType;
        this.hairColor = (byte) hairColor;
        this.tattoo = (byte) tattoo;
        this.eyeColor = (byte) eyeColor;
        this.height = (byte) height;
        this.torso = (byte) torso;
        this.armsSize = (byte) armsSize;
        this.legsSize = (byte) legsSize;
        this.breast = (byte) breast;
        this.target1 = (byte) target1;
        this.target2 = (byte) target2;
        this.target3 = (byte) target3;
        this.target4 = (byte) target4;
        this.target5 = (byte) target5;
        this.target6 = (byte) target6;
        this.target7 = (byte) target7;
        this.target8 = (byte) target8;
    }

    public void setBody(int hairType, int hairColor, int tattoo, int eyeColor) {
        this.hairType = (byte) hairType;
        this.hairColor = (byte) hairColor;
        this.tattoo = (byte) tattoo;
        this.eyeColor = (byte) eyeColor;
    }

    public void setGabarits(int height, int torso, int armsSize, int legsSize, int breast) {
        this.height = (byte) height;
        this.torso = (byte) torso;
        this.armsSize = (byte) armsSize;
        this.legsSize = (byte) legsSize;
        this.breast = (byte) breast;
    }

    public void setTargets(int target1, int target2, int target3, int target4, int target5, int target6, int target7, int target8) {
        this.target1 = (byte) target1;
        this.target2 = (byte) target2;
        this.target3 = (byte) target3;
        this.target4 = (byte) target4;
        this.target5 = (byte) target5;
        this.target6 = (byte) target6;
        this.target7 = (byte) target7;
        this.target8 = (byte) target8;
    }

    public byte getHairType() {
        return hairType;
    }

    public void setHairType(byte hairType) {
        this.hairType = hairType;
    }

    public byte getHairColor() {
        return hairColor;
    }

    public void setHairColor(byte hairColor) {
        this.hairColor = hairColor;
    }

    public byte getTattoo() {
        return tattoo;
    }

    public void setTattoo(byte tattoo) {
        this.tattoo = tattoo;
    }

    public byte getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(byte eyeColor) {
        this.eyeColor = eyeColor;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(byte height) {
        this.height = height;
    }

    public byte getTorso() {
        return torso;
    }

    public void setTorso(byte torso) {
        this.torso = torso;
    }

    public byte getArmsSize() {
        return armsSize;
    }

    public void setArmsSize(byte armsSize) {
        this.armsSize = armsSize;
    }

    public byte getLegsSize() {
        return legsSize;
    }

    public void setLegsSize(byte legsSize) {
        this.legsSize = legsSize;
    }

    public byte getBreast() {
        return breast;
    }

    public void setBreast(byte breast) {
        this.breast = breast;
    }

    public byte getTarget1() {
        return target1;
    }

    public void setTarget1(byte target1) {
        this.target1 = target1;
    }

    public byte getTarget2() {
        return target2;
    }

    public void setTarget2(byte target2) {
        this.target2 = target2;
    }

    public byte getTarget3() {
        return target3;
    }

    public void setTarget3(byte target3) {
        this.target3 = target3;
    }

    public byte getTarget4() {
        return target4;
    }

    public void setTarget4(byte target4) {
        this.target4 = target4;
    }

    public byte getTarget5() {
        return target5;
    }

    public void setTarget5(byte target5) {
        this.target5 = target5;
    }

    public byte getTarget6() {
        return target6;
    }

    public void setTarget6(byte target6) {
        this.target6 = target6;
    }

    public byte getTarget7() {
        return target7;
    }

    public void setTarget7(byte target7) {
        this.target7 = target7;
    }

    public byte getTarget8() {
        return target8;
    }

    public void setTarget8(byte target8) {
        this.target8 = target8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BodyInfo bodyInfo = (BodyInfo) o;

        if (hairType != bodyInfo.hairType) return false;
        if (hairColor != bodyInfo.hairColor) return false;
        if (tattoo != bodyInfo.tattoo) return false;
        if (eyeColor != bodyInfo.eyeColor) return false;
        if (height != bodyInfo.height) return false;
        if (torso != bodyInfo.torso) return false;
        if (armsSize != bodyInfo.armsSize) return false;
        if (legsSize != bodyInfo.legsSize) return false;
        if (breast != bodyInfo.breast) return false;
        if (target1 != bodyInfo.target1) return false;
        if (target2 != bodyInfo.target2) return false;
        if (target3 != bodyInfo.target3) return false;
        if (target4 != bodyInfo.target4) return false;
        if (target5 != bodyInfo.target5) return false;
        if (target6 != bodyInfo.target6) return false;
        if (target7 != bodyInfo.target7) return false;
        return target8 == bodyInfo.target8;

    }

    @Override
    public int hashCode() {
        int result = (int) hairType;
        result = 31 * result + (int) hairColor;
        result = 31 * result + (int) tattoo;
        result = 31 * result + (int) eyeColor;
        result = 31 * result + (int) height;
        result = 31 * result + (int) torso;
        result = 31 * result + (int) armsSize;
        result = 31 * result + (int) legsSize;
        result = 31 * result + (int) breast;
        result = 31 * result + (int) target1;
        result = 31 * result + (int) target2;
        result = 31 * result + (int) target3;
        result = 31 * result + (int) target4;
        result = 31 * result + (int) target5;
        result = 31 * result + (int) target6;
        result = 31 * result + (int) target7;
        result = 31 * result + (int) target8;
        return result;
    }

    @Override
    public String toString() {
        return "BodyInfo{" +
                "hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", tattoo=" + tattoo +
                ", eyeColor=" + eyeColor +
                ", \n\t\theight=" + height +
                ", torso=" + torso +
                ", armsSize=" + armsSize +
                ", legsSize=" + legsSize +
                ", breast=" + breast +
                ", \n\t\ttarget1=" + target1 +
                ", target2=" + target2 +
                ", target3=" + target3 +
                ", target4=" + target4 +
                ", target5=" + target5 +
                ", target6=" + target6 +
                ", target7=" + target7 +
                ", target8=" + target8 +
                "}\n";
    }
}
