package Service;

import ManageTiktok.Follower;
import ManageTiktok.Idol;
import ManageTiktok.Song;
import ManageTiktok.Tiktok;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {
    public Tiktok createrTiktok(IdolService idolService, ArrayList<Idol> idols, FollowerService followerService, ArrayList<Follower> followers, SongService songService, ArrayList<Song> songs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số idol: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int  i =0; i<n; i++){
            Idol idol = idolService.createrIdol(followerService, followers);
            idols.add(idol);

        }
        System.out.println("Nhập số bài hát: ");
        int m = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<m; i++){
            Song song = songService.createrSong();
            songs.add(song);
        }
        return new Tiktok(idols, songs) ;
    }
}
