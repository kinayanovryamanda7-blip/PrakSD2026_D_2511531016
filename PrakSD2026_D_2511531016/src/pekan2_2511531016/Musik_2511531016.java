package pekan2_2511531016;

public class Musik_2511531016 {
    private String judul_1016;
    private String penyanyi_1016;
    private int durasi_1016;

    // Konstruktor
    public Musik_2511531016(String judul, String penyanyi, int durasi) {
        this.judul_1016 = judul;
        this.penyanyi_1016 = penyanyi;
        this.durasi_1016 = durasi;
    }
    
    //Selektor
    public String getJudul_1016() {
        return judul_1016;
    }
    public String getPenyanyi_1016() {
        return penyanyi_1016;
    }
    public int getDurasi_1016() {
        return durasi_1016;
    }

    // Mutator
    public void setJudul_1016(String judul) {
        this.judul_1016 = judul;
    }
    public void setPenyanyi_1016(String penyanyi) {
        this.penyanyi_1016 = penyanyi;
    }
    public void setDurasi_1016(int durasi) {
        this.durasi_1016 = durasi;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_1016 + ", Penyanyi: " + penyanyi_1016 + ", Durasi: " + durasi_1016 + " detik";
    }
}