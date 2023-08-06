package Service;

import ManageTiktok.Follower;

import java.util.Scanner;

public class FollowerService {
   public Follower createrFollower(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập tên follower");
       String nameFo = scanner.nextLine();
       System.out.println("Nhập email follower: ");
       String emailFo = scanner.nextLine();
       System.out.println("Nhập number of like: ");
       int numberOfLike = Integer.parseInt(scanner.nextLine());

       return new Follower(nameFo, emailFo, numberOfLike);

   }
}
