package Service;

import ManageTiktok.Follower;
import ManageTiktok.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public Idol createrIdol(FollowerService followerService, ArrayList<Follower> followers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên Idol: ");
        String nameIdol = scanner.nextLine();
        System.out.println("Nhập email idol:");
        String emailIdol = scanner.nextLine();
        System.out.println("Nhập số follower: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i<n; i++){
            Follower follower = followerService.createrFollower();
            followers.add(follower);
        }
        System.out.println("Nhập group idol: ");
        String group = scanner.nextLine();
        return new Idol(nameIdol, emailIdol, group, followers);
    }

}
