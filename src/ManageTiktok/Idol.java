package ManageTiktok;

import java.util.ArrayList;

public class Idol {
    private static int autoIdIdol;
    private int idIdol;
    private String nameIdol;
    private String emailIdol;
    private String groupIdol;
    private ArrayList<Follower> followers;

    public Idol( String nameIdol, String emailIdol, String groupIdol, ArrayList<Follower> followers) {
        this.idIdol = ++autoIdIdol;
        this.nameIdol = nameIdol;
        this.emailIdol = emailIdol;
        this.groupIdol = groupIdol;
        this.followers = followers;
    }

    public static int getAutoIdIdol() {
        return autoIdIdol;
    }

    public static void setAutoIdIdol(int autoIdIdol) {
        Idol.autoIdIdol = autoIdIdol;
    }

    public int getIdIdol() {
        return idIdol;
    }

    public void setIdIdol(int idIdol) {
        this.idIdol = idIdol;
    }

    public String getNameIdol() {
        return nameIdol;
    }

    public void setNameIdol(String nameIdol) {
        this.nameIdol = nameIdol;
    }

    public String getEmailIdol() {
        return emailIdol;
    }

    public void setEmailIdol(String emailIdol) {
        this.emailIdol = emailIdol;
    }

    public String getGroupIdol() {
        return groupIdol;
    }

    public void setGroupIdol(String groupIdol) {
        this.groupIdol = groupIdol;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "idIdol=" + idIdol +
                ", nameIdol='" + nameIdol + '\'' +
                ", emailIdol='" + emailIdol + '\'' +
                ", groupIdol='" + groupIdol + '\'' +
                ", followers=" + followers +
                '}';
    }
}
