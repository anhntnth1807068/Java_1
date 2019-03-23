import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("tên game");
        String name = scanner.nextLine();
        System.out.println("Thong tin game");
        String mota = scanner.nextLine();
        System.out.println("gia game ");
        int gia = scanner.nextInt();
        System.out.println("ngay phat hanh");
        String ngayPhatHanh = scanner.nextLine();
        System.out.println("trang chu");
        String trangChu = scanner.nextLine();

        Game game =  new Game(name, mota, gia, ngayPhatHanh, trangChu);

        System.out.println(game.toString());





    }
}
