public class Game {
    private String  tên;
    private String moTa;
    private int gia;
    private String ngayPhatHanh;
    private String trangChu;

    public Game() {
    }

    public Game(String tên, String moTa, int gia, String ngayPhatHanh, String trangChu) {
        this.tên = tên;
        this.moTa = moTa;
        this.gia = gia;
        this.ngayPhatHanh = ngayPhatHanh;
        this.trangChu = trangChu;
    }

    public String getTên() {
        return tên;
    }

    public void setTên(String tên) {
        this.tên = tên;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getTrangChu() {
        return trangChu;
    }

    public void setTrangChu(String trangChu) {
        this.trangChu = trangChu;
    }

    @Override
    public String toString() {
        return "Game{" +
                "tên=" + tên +
                ", moTa=" + moTa +
                ", gia=" + gia +
                ", ngayPhatHanh=" + ngayPhatHanh +
                ", trangChu='" + trangChu + '\'' +
                '}';
    }
}
