/**
 * Kelas ini merepresentasikan Gaji Karyawan
 */
public class GajiKaryawan {
    private String nama;
    private double gajiDasar;
    private double tunjangan;

    /**
     *
     * @param nama
     * @param gajiDasar
     * @param tunjangan
     */


    public GajiKaryawan(String nama, double gajiDasar, double tunjangan) {
        this.nama = nama;
        this.gajiDasar = gajiDasar;
        this.tunjangan = tunjangan;
    }

    /**
     * Menghitung gaji total karyawan.
     * Gaji total adalah gaji dasar ditambah dengan tunjangan.
     *
     * @return Gaji total karyawan.
     */
    public double hitungGajiTotal() {
        return gajiDasar + tunjangan;
    }

    /**
     * Mengambil nama karyawan.
     *
     * @return Nama karyawan.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil gaji dasar karyawan.
     *
     * @return Gaji dasar karyawan.
     */
    public double getGajiDasar() {
        return gajiDasar;
    }

    /**
     * Mengambil tunjangan karyawan.
     *
     * @return Tunjangan karyawan.
     */
    public double getTunjangan() {
        return tunjangan;
    }

    /**
     * Mengatur nama karyawan.
     *
     * @param nama Nama karyawan.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengatur gaji dasar karyawan.
     *
     * @param gajiDasar Gaji dasar karyawan.
     */
    public void setGajiDasar(double gajiDasar) {
        this.gajiDasar = gajiDasar;
    }

    /**
     * Mengatur tunjangan karyawan.
     *
     * @param tunjangan Tunjangan karyawan.
     */
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    /**
     * Representasi String dari objek GajiKaryawan.
     *
     * @return String yang berisi informasi gaji karyawan.
     */
    @Override
    public String toString() {
        return "Karyawan: " + nama + "\nGaji Dasar: " + gajiDasar + "\nTunjangan: " + tunjangan + "\nGaji Total: " + hitungGajiTotal();
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        GajiKaryawan karyawan = new GajiKaryawan("Okta Ramji", 10000, 4000);
        System.out.println(karyawan.toString());
    }
}