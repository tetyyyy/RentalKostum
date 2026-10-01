package com.mycompany.rentalkostum;

public class Kostum {
     private String kodeKostum;
    private String namaKostum;
    private double hargaSewa;
    private int stok;

    private static int jumlahKostum = 0;

    public Kostum(String kodeKostum, String namaKostum,
            double hargaSewa, int stok) {

        this.kodeKostum = kodeKostum;
        this.namaKostum = namaKostum;
        this.hargaSewa = hargaSewa;
        this.stok = stok;

        jumlahKostum++;
    }

    public String getKodeKostum() {
        return kodeKostum;
    }

    public void setKodeKostum(String kodeKostum) {
        this.kodeKostum = kodeKostum;
    }

    public String getNamaKostum() {
        return namaKostum;
    }

    public void setNamaKostum(String namaKostum) {
        this.namaKostum = namaKostum;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa >= 0) {
            this.hargaSewa = hargaSewa;
        } else {
            System.out.println("Harga sewa tidak boleh negatif.");
        }
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif.");
        }
    }

    public static int getJumlahKostum() {
        return jumlahKostum;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Kostum : " + kodeKostum);
        System.out.println("Nama Kostum : " + namaKostum);
        System.out.println("Harga Sewa  : Rp" + hargaSewa);
        System.out.println("Stok        : " + stok);
    }
}

    
