public class Nasabah12 {

    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;

    Nasabah12(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    public Nasabah12() {
        // Konstruktor default
        this.norek = "";
        this.nama = "";
        this.alamat = "";
        this.umur = 0;
        this.saldo = 0.0;
    }
}
