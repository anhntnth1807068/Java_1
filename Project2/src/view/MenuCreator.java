package view;

import Controller.FoodController;

import java.util.Scanner;

public class MenuCreator {
    public static void createMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            FoodController controller = new FoodController();
            System.out.println("1.them mon an");
            System.out.println("2.hien thi danh sach mon an");
            System.out.println("3.thoat truong trinh");
            System.out.println("----------------------");
            System.out.println("vui long nhap lua chon cua ban");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addFood();
                    break;
                case 2:
                    controller.printList();
                    break;
                case 3:
                    System.out.println("ban da lua chon 3");
                    System.exit(1);
                    break;
                default:
                    System.out.println("default");
            }

        }
    }

}

