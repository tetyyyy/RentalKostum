package com.mycompany.rentalkostum;

public class KostumPernikahan extends Kostum {

    private String jenisPernikahan;
    private String daerahAsal;

    public KostumPernikahan(String kodeKostum, String namaKostum,
            double hargaSewa, int stok,
            String jenisPernikahan, String daerahAsal) {

        super(kodeKostum, namaKostum, hargaSewa, stok);

        this.jenisPernikahan = jenisPernikahan;
        this.daerahAsal = daerahAsal;
    }

    public String getJenisPernikahan() {
        return jenisPernikahan;
    }

    public void setJenisPernikahan(String jenisPernikahan) {
        this.jenisPernikahan = jenisPernikahan;
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

        System.out.println("Jenis Pernikahan : " + jenisPernikahan);
        System.out.println("Daerah Asal      : " + daerahAsal);
    }
}
