import java.util.Scanner;

public class Matakuliah04 {
    public int sks, jumlahJam;
    public String kode, nama;

    public Matakuliah04(){

    }

    public Matakuliah04(String kd, String nm, int sksInpt, int jmlhJam){
        this.kode = kd;
        this.nama = nm;
        this.sks = sksInpt;
        this.jumlahJam = jmlhJam;
    }

    public Matakuliah04(String kd, String nm) {
        this.kode = kd;
        this.nama = nm;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode\t: ");
        this.kode = sc.nextLine();
        System.out.print("Nama\t: ");
        this.nama = sc.nextLine();
        System.out.print("Sks\t: ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam\t: ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------------------");
        sc.close();
    }

    public void cetakInfo() {
        System.out.println("Kode\t: " + this.kode);
        System.out.println("Nama\t: " + this.nama);
        System.out.println("SKS\t: " + this.sks);
        System.out.println("Jumlah Jam\t: " + this.jumlahJam);
        System.out.println("------------------------------------------------");
    }

}
