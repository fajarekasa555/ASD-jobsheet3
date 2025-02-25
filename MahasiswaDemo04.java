import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04[] arrayMahasiswa = new Mahasiswa04[3];
        String dummy;

        for(int i = 0; i < 3; i++){
            arrayMahasiswa[i] = new Mahasiswa04();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM\t: ");
            arrayMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i].cetakInfo();
        }

    }
}
