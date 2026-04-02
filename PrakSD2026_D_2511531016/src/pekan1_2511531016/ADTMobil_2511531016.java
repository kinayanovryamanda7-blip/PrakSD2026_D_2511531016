package pekan1_2511531016;

public class ADTMobil_2511531016 {
    private String nama;
    private int tahun, cc;
    private double harga;
    private String merk;
    
    private static ADTMobil_2511531016[] data = new ADTMobil_2511531016[10];
    private static int jumlah = 0;

    // Konstruktor
    public ADTMobil_2511531016(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // SeleKtor
    public String getNama() { return nama; }
    public int getTahun() { return tahun; }
    public int getCc() { return cc; }
    public double getHarga() { return harga; }
    public String getMerk() { return merk; }

    // Mutator
    public void setNama(String nama) { this.nama = nama; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    public void setCc(int cc) { this.cc = cc; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setMerk(String merk) { this.merk = merk; }

    // Tambah mobil
    public static void tambahMobil(ADTMobil_2511531016 m) {
        if (jumlah < data.length) {
            data[jumlah] = m;
            jumlah++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // Hapus mobil
    public static void hapusMobil(int index) {
        if (index >= 0 && index < jumlah) {
            for (int i = index; i < jumlah - 1; i++) {
                data[i] = data[i + 1];
            }
            data[jumlah - 1] = null;
            jumlah--;
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    // Tampilkan
    public static void tampil() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(i + ". " + data[i]);
        }
    }

    public String toString() {
        return nama + " | " + tahun + " | " + cc + "cc | " + String.format("%.0f", harga) + " | " + merk;
    }
}