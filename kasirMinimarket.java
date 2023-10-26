import java.util.Scanner;

public class kasirMinimarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaBarang = {"Sabun", "Shampoo", "Pasta Gigi", "Sikat Gigi", "Handuk"};
        int[] hargaBarang = {5000, 10000, 7000, 3000, 15000};
        int[] stokBarang = {10, 5, 8, 12, 7};

        System.out.println("Daftar Barang:");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println(i + ". " + namaBarang[i] + " - Harga: " + hargaBarang[i] + " - Stok: " + stokBarang[i]);
        }

        System.out.print("Masukkan nama barang yang ingin dicari: ");
        String barangDicari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < namaBarang.length; i++) {
            if (namaBarang[i].equalsIgnoreCase(barangDicari)) {
                System.out.println("Barang ditemukan:");
                System.out.println("Nama Barang: " + namaBarang[i]);
                System.out.println("Harga: " + hargaBarang[i]);
                System.out.println("Stok: " + stokBarang[i]);
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}