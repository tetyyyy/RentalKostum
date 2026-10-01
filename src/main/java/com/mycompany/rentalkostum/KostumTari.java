package com.mycompany.rentalkostum;

public class KostumTari extends Kostum {
    private String jenisTari;
    private String daerahAsal;

    public KostumTari(String kodeKostum, String namaKostum,
            double hargaSewa, int stok,
            String jenisTari, String daerahAsal) {

        super(kodeKostum, namaKostum, hargaSewa, stok);

        this.jenisTari = jenisTari;
        this.daerahAsal = daerahAsal;
    }

    public String getJenisTari() {
        return jenisTari;
    }

    public void setJenisTari(String jenisTari) {
        this.jenisTari = jenisTari;
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

        System.out.println("Jenis Tari  : " + jenisTari);
        System.out.println("Daerah Asal : " + daerahAsal);
    }
}
