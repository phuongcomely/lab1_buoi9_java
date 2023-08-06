package ManageTiktok;

public class Follower {
    private static int autoIdFollower;
    private int idFo;
    private String nameFo;
    private String emailFo;
    private int numberOfLike;

    public Follower( String nameFo, String emailFo, int numberOfLike) {
        this.idFo = ++autoIdFollower;
        this.nameFo = nameFo;
        this.emailFo = emailFo;
        this.numberOfLike = numberOfLike;
    }


    public int getIdFo() {
        return idFo;
    }

    public void setIdFo(int idFo) {
        this.idFo = idFo;
    }

    public String getNameFo() {
        return nameFo;
    }

    public void setNameFo(String nameFo) {
        this.nameFo = nameFo;
    }

    public String getEmailFo() {
        return emailFo;
    }

    public void setEmailFo(String emailFo) {
        this.emailFo = emailFo;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "idFo=" + idFo +
                ", nameFo='" + nameFo + '\'' +
                ", emailFo='" + emailFo + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
