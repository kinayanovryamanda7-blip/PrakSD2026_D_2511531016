package pekan7_2511531016;

public class Mahasiswa_2511531016 {
    private String nama_1016;
    private String nim_1016;
    private String prodi_1016;

    public Mahasiswa_2511531016(
            String nama_1016,
            String nim_1016,
            String prodi_1016) {

        this.nama_1016 = nama_1016;
        this.nim_1016 = nim_1016;
        this.prodi_1016 = prodi_1016;
    }

    public String getNama_1016() {
        return nama_1016;
    }

    public void setNama_1016(String nama_1016) {
        this.nama_1016 = nama_1016;
    }

    public String getNim_1016() {
        return nim_1016;
    }

    public void setNim_1016(String nim_1016) {
        this.nim_1016 = nim_1016;
    }

    public String getProdi_1016() {
        return prodi_1016;
    }

    public void setProdi_1016(String prodi_1016) {
        this.prodi_1016 = prodi_1016;
    }

    @Override
    public String toString() {

        return nama_1016 + " - " + nim_1016 + " - " + prodi_1016;
    }
}