package entity;

public class ThongTinBang {
private String day;
private String id;
private String title;
private String view;

    public ThongTinBang() {
    }

    public ThongTinBang(String day, String id, String title, String view) {
        this.day = day;
        this.id = id;
        this.title = title;
        this.view = view;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
