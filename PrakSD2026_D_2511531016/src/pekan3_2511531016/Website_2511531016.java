package pekan3_2511531016;

public class Website_2511531016 {
    private String judul_1016;
    private String url_1016;

    // Konstruktor
    public Website_2511531016(String judul, String url) {
        this.judul_1016 = judul;
        this.url_1016 = url;
    }

    // Selektor
    public String getJudul_1016() {
        return judul_1016;
    }
    public String getUrl_1016() {
        return url_1016;
    }

    // Mutator
    public void setJudul_1016(String judul) {
        this.judul_1016 = judul;
    }
    public void setUrl_1016(String url) {
        this.url_1016 = url;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_1016 + ", URL: " + url_1016;
    }
}