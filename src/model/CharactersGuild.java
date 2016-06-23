package model;

/**
 * Representing information about character's guild
 */
public class CharactersGuild {
    private long guildId;
    private String guildName;
    private long guildIcon;
    private String guildMemberStatus;   // grade

    public CharactersGuild() {
    }

    public CharactersGuild(long guildId, String guildName, long guildIcon, String guildMemberStatus) {
        this.guildId = guildId;
        this.guildName = guildName;
        this.guildIcon = guildIcon;
        this.guildMemberStatus = guildMemberStatus;
    }

    public long getGuildId() {
        return guildId;
    }

    public void setGuildId(long guildId) {
        this.guildId = guildId;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public long getGuildIcon() {
        return guildIcon;
    }

    public void setGuildIcon(long guildIcon) {
        this.guildIcon = guildIcon;
    }

    public String getGuildMemberStatus() {
        return guildMemberStatus;
    }

    public void setGuildMemberStatus(String guildMemberStatus) {
        this.guildMemberStatus = guildMemberStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharactersGuild that = (CharactersGuild) o;

        if (guildId != that.guildId) return false;
        if (guildIcon != that.guildIcon) return false;
        if (!guildName.equals(that.guildName)) return false;
        return guildMemberStatus.equals(that.guildMemberStatus);

    }

    @Override
    public int hashCode() {
        int result = (int) (guildId ^ (guildId >>> 32));
        result = 31 * result + guildName.hashCode();
        result = 31 * result + (int) (guildIcon ^ (guildIcon >>> 32));
        result = 31 * result + guildMemberStatus.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Guild{" +
                "guildId=" + guildId +
                ", guildName='" + guildName + '\'' +
                ", guildIcon=" + guildIcon +
                ", guildMemberStatus='" + guildMemberStatus + '\'' +
                "}\n";
    }
}
