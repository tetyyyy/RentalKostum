package com.mycompany.rentalkostum;

import java.util.Scanner;

public class RentalKostum {
    static Scanner input = new Scanner(System.in);

    static Kostum[] daftarKostum = new Kostum[20];

    static int jumlahData = 0;

    public static void main(String[] args) {

        isiDataAwal();

        int pilihan;

        do {

            System.out.println();
            System.out.println("==========================================");
            System.out.println("   SISTEM PENYEWAAN KOSTUM TRADISIONAL");
            System.out.println("==========================================");
            System.out.println("1. Tambah Data Kostum");
            System.out.println("2. Tampilkan Semua Kostum");
            System.out.println("3. Cari Kostum");
            System.out.println("4. Jumlah Kostum");
            System.out.println("5. Keluar");
            System.out.println("==========================================");

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahKostum();
                    break;

                case 2:
                    tampilkanSemua();
                    break;

                case 3:
                    cariKostum();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Jumlah objek kostum : "
                            + Kostum.getJumlahKostum());
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Terima kasih telah menggunakan");
                    System.out.println("Sistem Penyewaan Kostum Tradisional.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    public static void isiDataAwal() {

        daftarKostum[jumlahData] = new KostumTari(
                "KT001",
                "Kostum Tari Piring",
                75000,
                5,
                "Tari Piring",
                "Sumatera Barat"
        );
        jumlahData++;

        daftarKostum[jumlahData] = new KostumTari(
                "KT002",
                "Kostum Tari Saman",
                80000,
                4,
                "Tari Saman",
                "Aceh"
        );
        jumlahData++;

        daftarKostum[jumlahData] = new KostumAdat(
                "KA001",
                "Baju Adat Lampung",
                100000,
                3,
                "Pepadun",
                "Lampung"
        );
        jumlahData++;

        daftarKostum[jumlahData] = new KostumAdat(
                "KA002",
                "Baju Adat Jawa",
                90000,
                6,
                "Jawa",
                "Jawa Tengah"
        );
        jumlahData++;
    }

    public static void tambahKostum() {

        if (jumlahData >= daftarKostum.length) {
            System.out.println("Data kostum sudah penuh.");
            return;
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          TAMBAH DATA KOSTUM");
        System.out.println("==========================================");

        System.out.println("1. Kostum Tari");
        System.out.println("2. Kostum Adat");

        System.out.print("Pilih jenis kostum : ");
        int jenis = input.nextInt();
        input.nextLine();

        if (jenis != 1 && jenis != 2) {
            System.out.println("Jenis kostum tidak tersedia.");
            return;
        }

        System.out.print("Kode Kostum : ");
        String kode = input.nextLine();

        System.out.print("Nama Kostum : ");
        String nama = input.nextLine();

        System.out.print("Harga Sewa : ");
        double harga = input.nextDouble();

        System.out.print("Stok : ");
        int stok = input.nextInt();
        input.nextLine();

        if (jenis == 1) {

            System.out.print("Jenis Tari : ");
            String jenisTari = input.nextLine();

            System.out.print("Daerah Asal : ");
            String daerah = input.nextLine();

            daftarKostum[jumlahData] = new KostumTari(
                    kode,
                    nama,
                    harga,
                    stok,
                    jenisTari,
                    daerah
            );

            jumlahData++;

            System.out.println("Data Kostum Tari berhasil ditambahkan.");

        } else {

            System.out.print("Nama Adat : ");
            String namaAdat = input.nextLine();

            System.out.print("Daerah Asal : ");
            String daerah = input.nextLine();

            daftarKostum[jumlahData] = new KostumAdat(
                    kode,
                    nama,
                    harga,
                    stok,
                    namaAdat,
                    daerah
            );

            jumlahData++;

            System.out.println("Data Kostum Adat berhasil ditambahkan.");
        }
    }

    public static void tampilkanSemua() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             DAFTAR KOSTUM");
        System.out.println("==========================================");

        if (jumlahData == 0) {

            System.out.println("Belum ada data kostum.");

        } else {

            for (int i = 0; i < jumlahData; i++) {

                System.out.println();
                System.out.println("Data ke-" + (i + 1));
                System.out.println("------------------------------------------");

                daftarKostum[i].tampilkanInfo();

                System.out.println("------------------------------------------");
            }
        }
    }

    public static void cariKostum() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              CARI KOSTUM");
        System.out.println("==========================================");

        System.out.println("1. Cari berdasarkan kode");
        System.out.println("2. Cari berdasarkan nama");

        System.out.print("Pilih pencarian : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {

            System.out.print("Masukkan kode kostum : ");
            String kode = input.nextLine();

            cariKostum(kode);

        } else if (pilihan == 2) {

            System.out.print("Masukkan nama kostum : ");
            String nama = input.nextLine();

            cariKostum(nama, true);

        } else {

            System.out.println("Pilihan pencarian tidak tersedia.");
        }
    }

    public static void cariKostum(String kode) {

        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {

            if (daftarKostum[i].getKodeKostum()
                    .equalsIgnoreCase(kode)) {

                System.out.println();
                System.out.println("Kostum ditemukan:");
                daftarKostum[i].tampilkanInfo();

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println(
                    "Kostum dengan kode tersebut tidak ditemukan."
            );
        }
    }

    public static void cariKostum(String nama, boolean berdasarkanNama) {

        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {

            if (daftarKostum[i].getNamaKostum()
                    .equalsIgnoreCase(nama)) {

                System.out.println();
                System.out.println("Kostum ditemukan:");
                daftarKostum[i].tampilkanInfo();

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println(
                    "Kostum dengan nama tersebut tidak ditemukan."
            );
        }
    }
}

