package pekan6_2511531016;

public class Lagu_2511531016 {
    String judul_1016;
    String penyanyi_1016;
    Lagu_2511531016 next_1016;
    Lagu_2511531016 prev_1016;

    // konstruktor
    public Lagu_2511531016(String judul_1016, String penyanyi_1016) {
        this.judul_1016 = judul_1016;
        this.penyanyi_1016 = penyanyi_1016;
        this.next_1016 = null;
        this.prev_1016 = null;
    }

    // getter
    public String getJudul_1016() {
        return judul_1016;
    }
    public String getPenyanyi_1016() {
        return penyanyi_1016;
    }

    // setter
    public void setJudul_1016(String judul_1016) {
        this.judul_1016 = judul_1016;
    }
    public void setPenyanyi_1016(String penyanyi_1016) {
        this.penyanyi_1016 = penyanyi_1016;
    }
}
