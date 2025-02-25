import java.util.Scanner;
public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlDosen;
        System.out.print("Masukkan jumlah dosen : ");
        jmlDosen = sc.nextInt();
        Dosen04[] arrayofDosen = new Dosen04[jmlDosen];

        for(int i = 0; i < jmlDosen; i++){
            System.out.println("\nTambah data dosen ke-" + (i + 1));
            arrayofDosen[i] = new Dosen04();
            arrayofDosen[i].inputDosen();
        }

        // for (int i = 0; i < jmlDosen; i++) {
        //     System.out.println("\nData dosen ke-" + (i + 1));
        //     arrayofDosen[i].cetakInfo();
        // }

        DataDosen04.dataSemuaDosen(arrayofDosen);
        DataDosen04.jumlahDosenperJumlahKelamin(arrayofDosen);
        DataDosen04.rataUsiaPerJenisKlmn(arrayofDosen);
        DataDosen04.dosenSepuh(arrayofDosen);
        DataDosen04.dosenMuda(arrayofDosen, jmlDosen);

        sc.close();
    }
}
