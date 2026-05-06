package pekan5_2511531016;

public class Pasien_2511531016 {
    String namaPasien_1016;
    String penyakit_1016;
    int noAntrian_1016;
    Pasien_2511531016 next_1016;

    // konstruktor
    public Pasien_2511531016(String namaPasien_1016, String penyakit_1016, int noAntrian_1016) {
        this.namaPasien_1016 = namaPasien_1016;
        this.penyakit_1016 = penyakit_1016;
        this.noAntrian_1016 = noAntrian_1016;
        this.next_1016 = null;
    }

    // getter
    public String getNamaPasien_1016() {
        return namaPasien_1016;
    }
    public String getPenyakit_1016() {
        return penyakit_1016;
    }
    public int getNoAntrian_1016() {
        return noAntrian_1016;
    }
    public Pasien_2511531016 getNext_1016() {
        return next_1016;
    }

    // setter
    public void setNamaPasien_1016(String namaPasien_1016) {
        this.namaPasien_1016 = namaPasien_1016;
    }
    public void setPenyakit_1016(String penyakit_1016) {
        this.penyakit_1016 = penyakit_1016;
    }
    public void setNoAntrian_1016(int noAntrian_1016) {
        this.noAntrian_1016 = noAntrian_1016;
    }
    public void setNext_1016(Pasien_2511531016 next_1016) {
        this.next_1016 = next_1016;
    }
}