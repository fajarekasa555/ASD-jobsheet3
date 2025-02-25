import java.util.Scanner;

public class MatakuliahDemo04 {

    public static void main(String[] args) {
        int jumlahMtakul;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        jumlahMtakul = sc.nextInt();
        Matakuliah04[] arrayofMatakuliah = new Matakuliah04[jumlahMtakul];

        for(int i = 0; i < jumlahMtakul; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah[i] = new Matakuliah04();
            arrayofMatakuliah[i].tambahData();
        }

        for (int i = 0; i < jumlahMtakul; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            arrayofMatakuliah[i].cetakInfo();
        }
        sc.close();
    }
}