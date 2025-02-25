public class DataDosen04 {
    void dataSemuaDosen(Dosen04[] arrayofDosen){
        for (Dosen04 dosen : arrayofDosen) {
            System.out.println("\nData Semua Dosen");
            dosen.cetakInfo();
        }
    }

    void jumlahDosenperJumlahKelamin(Dosen04[] arrayofDosen){
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

    void rataUsiaPerJenisKlmn(Dosen04[] arrayofDosen){
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

    void dosenSepuh(Dosen04[] arrayofDosen){
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
    void dosenMuda(Dosen04[] arrayofDosen, int lenght){
        int dosenId = 0, dosenMuda = arrayofDosen[0].usia;
        for (int i = 0; i < lenght; i++) {
            if(arrayofDosen[i].usia <  dosenMuda){
                dosenMuda = arrayofDosen[i].usia;
                dosenId = i;
            }
        }
        System.out.println("\nInfo Dosen Paling Tua:");
        arrayofDosen[dosenId].cetakInfo();
    }
}
