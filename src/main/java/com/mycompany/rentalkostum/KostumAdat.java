package com.mycompany.rentalkostum;

public class KostumAdat extends Kostum {
    private String namaAdat;
    private String daerahAsal;

    public KostumAdat(String kodeKostum, String namaKostum,
            double hargaSewa, int stok,
            String namaAdat, String daerahAsal) {

        super(kodeKostum, namaKostum, hargaSewa, stok);

        this.namaAdat = namaAdat;
        this.daerahAsal = daerahAsal;
    }

    public String getNamaAdat() {
        return namaAdat;
    }

    public void setNamaAdat(String namaAdat) {
        this.namaAdat = namaAdat;
    }

    public String getDaerahAsal() {
        return daerahAsal;
    }

    public void setDaerahAsal(String daerahAsal) {
        this.daerahAsal = daerahAsal;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();

        System.out.println("Nama Adat   : " + namaAdat);
        System.out.println("Daerah Asal : " + daerahAsal);
    }
}
