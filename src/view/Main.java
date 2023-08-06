package view;

import ManageTiktok.Follower;
import ManageTiktok.Idol;
import ManageTiktok.Song;
import ManageTiktok.Tiktok;
import Service.FollowerService;
import Service.IdolService;
import Service.SongService;
import Service.TiktokService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongService();
        FollowerService followerService = new FollowerService();
        IdolService idolService = new IdolService();
        ArrayList<Follower> followers = new ArrayList<>();

        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();

        TiktokService tiktokService = new TiktokService();
        Tiktok tiktok = tiktokService.createrTiktok(idolService, idols, followerService, followers, songService, songs );
        System.out.println(tiktok);

    }
}
