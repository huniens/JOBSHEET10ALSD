
/**
 * QueueMain12
 */
import java.util.Scanner;

public class QueueMain12 {

    public static void menu () {
    System.out.println("Pilih menu :");
    System.out.println("1. Antrian baru");
    System.out.println("2. Antrian keluar ");
    System.out.println("3. cek Antrian terdepan");
    System.out.println("4. Cek semua Antrian");
    //System.out.println("5. Cek Antrian paling belakang");
    System.out.println("_______________________");
}

public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan kapasitas queue : ");
    int jumlah = sc.nextInt();

    Queue12 antri = new Queue12(jumlah);

    int pilih;
    do {
        menu();
        pilih = sc.nextInt();
        sc.nextLine(); // Membuang newline character setelah nextInt()

        switch (pilih) {
            case 1:
                System.out.print("No Rekening : ");
                String norek = sc.next();
                System.out.print("Nama : ");
                String nama = sc.next();
                System.out.print("Alamat : ");
                String alamat = sc.next();
                System.out.print("Umur : ");
                int umur = sc.nextInt();
                System.out.print("Saldo : ");
                double saldo = sc.nextDouble();
                Nasabah12 dt = new Nasabah12(norek, nama, alamat, umur, saldo);
                sc.nextLine();
                antri.Enqueue(dt);
                break;
            case 2:
                Nasabah12 data = antri.Dequeue();
                if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                        && data.umur != 0 && data.saldo != 0){
                    System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                            + data.alamat + " " + data.umur + " " + data.saldo);
                }
                break;
            case 3:
                antri.peek();
                break;
            case 4:
                antri.print();
                break;
            case 5:
                antri.peekRear();
                break;
        }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    sc.close(); // Menutup scanner
}
}
