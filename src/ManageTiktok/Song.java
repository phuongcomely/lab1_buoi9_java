package ManageTiktok;

public class Song {
    private static int autoIdSong;
    private int idSong;
    private String nameSong;
    private String singer;

    public Song( String nameSong, String singer) {
        this.idSong = ++autoIdSong;
        this.nameSong = nameSong;
        this.singer = singer;
    }

    public static int getAutoIdSong() {
        return autoIdSong;
    }

    public static void setAutoIdSong(int autoIdSong) {
        Song.autoIdSong = autoIdSong;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "idSong=" + idSong +
                ", nameSong='" + nameSong + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
