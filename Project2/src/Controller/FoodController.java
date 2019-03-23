package Controller;

import entity.Food;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {

    ArrayList<Food> FoodArrayList = new ArrayList<>();

    public void addFood(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap thong tin mon an");
        int ma = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap ma mon an");
        String ten =scanner.nextLine();
        System.out.println("nhap ten mon an");
        String moTaGan=scanner.nextLine();
        System.out.println("nhap mo ta mon an");
        int gia =scanner.nextInt();
        scanner.nextLine();
        System.out.println("gia mon an");
        String ngayTao = scanner.nextLine();
        System.out.println("ngay tao mon an");

        Food  Food = new Food(ma, ten, moTaGan,gia , ngayTao );

        FoodArrayList.add(Food);
        System.out.println(Food.toString());


    }

    public  void printList(){

        System.out.printf("%15s |%15s |%15s |%15s |%15s\n", 12,"suon","ngon",11,"23/09/2000");
        for (int i = 0; i < FoodArrayList.size(); i++) {
            Food food = FoodArrayList.get(i);
            System.out.printf("%15s | %15s | %15s | %15s\n",
                    food.getMa(), food.getTen(), food.getMoTaGan(), food.getNgayTao());
        }
    }

}
