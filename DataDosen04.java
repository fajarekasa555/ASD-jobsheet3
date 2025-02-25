public class DataDosen04 {
    static void dataSemuaDosen(Dosen04[] arrayofDosen){
        System.out.println("\nData Semua Dosen");
        for (Dosen04 dosen : arrayofDosen) {
            dosen.cetakInfo();
        }
    }

    static void jumlahDosenperJumlahKelamin(Dosen04[] arrayofDosen){
        int jumlahLaki = 0, jumlahPerempuan = 0;
        for (Dosen04 dosen : arrayofDosen){
            if(dosen.jenisKelamin == true){
                jumlahLaki +=1;
            }else{
                jumlahPerempuan +=1;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki\t : " + jumlahLaki);
        System.out.println("Jumlah Dosen Perempuan\t : " + jumlahPerempuan);
    }

    static void rataUsiaPerJenisKlmn(Dosen04[] arrayofDosen){
        int jumlahLaki = 0, jumlahPerempuan = 0, totalUsiaLaki = 0, totalUsiaPerempuan = 0;
        for (Dosen04 dosen : arrayofDosen){
            if(dosen.jenisKelamin == true){
                totalUsiaLaki += dosen.usia;
                jumlahLaki +=1;
            }else{
                totalUsiaPerempuan += dosen.usia;
                jumlahPerempuan +=1;
            }
        }
        System.out.println("\nRata-rata Usia Dosen Laki-laki\t : " + (jumlahLaki != 0 ? (totalUsiaLaki/jumlahLaki) : 0));
        System.out.println("Rata-rata Usia Dosen Perempuan\t : " + (jumlahPerempuan != 0 ? (totalUsiaPerempuan/jumlahPerempuan) : 0));
    }

    static void dosenSepuh(Dosen04[] arrayofDosen){
        Dosen04 dosenSepuh = arrayofDosen[0];
        for (Dosen04 dosen : arrayofDosen) {
            if(dosen.usia >  dosenSepuh.usia){
                dosenSepuh = dosen;
            }
        }
        System.out.println("\nInfo Dosen Paling Tua:");
        dosenSepuh.cetakInfo();
    }

    // uji coba menggunakan lenght lewat parameter
    static void dosenMuda(Dosen04[] arrayofDosen, int lenght){
        int dosenId = 0, dosenMuda = arrayofDosen[0].usia;
        for (int i = 0; i < lenght; i++) {
            if(arrayofDosen[i].usia <  dosenMuda){
                dosenMuda = arrayofDosen[i].usia;
                dosenId = i;
            }
        }
        System.out.println("\nInfo Dosen Paling Muda:");
        arrayofDosen[dosenId].cetakInfo();
    }
}
