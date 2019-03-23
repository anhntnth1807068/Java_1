package entity;

public class Food {
    private int ma;
    private String ten;
    private String moTaGan;
    private int gia;
    private String ngayTao;

    public Food() {
    }

    public Food(int ma, String ten, String moTaGan, int gia, String ngayTao) {
        this.ma = ma;
        this.ten = ten;
        this.moTaGan = moTaGan;
        this.gia = gia;
        this.ngayTao = ngayTao;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTaGan() {
        return moTaGan;
    }

    public void setMoTaGan(String moTaGan) {
        this.moTaGan = moTaGan;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        System.out.println(String.format("%15s | %15s | %15s | %15s | %15s \n",
                "Ma mon an", "ten mon an", "mo ta mon", "gia mon an", "ngay tao mon"));
        return String.format("%15s|%15s|%15s|%15s|%15s|\n",this.ma,this.ten,this.moTaGan,this.gia,this.ngayTao);


    }
}