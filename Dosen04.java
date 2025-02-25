import java.util.Scanner;

public class Dosen04 {
    public String kode, nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen04(){

    }

    public Dosen04(String kd, String nm, Boolean jnsKel, int old){
        this.kode = kd;
        this.nama = nm;
        this.jenisKelamin = jnsKel;
        this.usia = old;
    }

    void inputDosen(Scanner sc){
        String kelamin;
        System.out.print("Kode\t\t: ");
        this.kode = sc.nextLine();
        sc.nextLine();
        System.out.print("Nama\t\t: ");
        this.nama = sc.nextLine();
        System.out.println("Jenis Kelamin (Pria / Wanita) ");
        System.out.print("Jenis Kelamin\t: ");
        kelamin = sc.nextLine();
        this.jenisKelamin = kelamin.equalsIgnoreCase("pria") ? true : false;
        System.out.print("Usia\t\t: ");
        this.usia = sc.nextInt();
        System.out.println("------------------------------------------------");
        new Dosen04(kode, nama, jenisKelamin, usia);
    }

    void cetakInfo() {
        System.out.println("Kode\t: " + this.kode);
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Jenis Kelamin\t: " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t: " + this.usia);
        System.out.println("------------------------------------------------");
    }


}
