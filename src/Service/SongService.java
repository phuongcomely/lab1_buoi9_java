package Service;

import ManageTiktok.Song;

import java.util.Scanner;

public class SongService {
    public Song createrSong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ca sĩ: ");
        String singer = scanner.nextLine();
        return new Song(name, singer);
    }
}
