import java.util.Scanner;

public class rekapPenjualan18 {

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    // a. Input data penjualan (array 2D)
    public static void inputPenjualan(int[][] data) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Input data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    // b. Tampilkan seluruh data penjualan
    public static void tampilData(int[][] data) {
        System.out.println("=== REKAP PENJUALAN CAFE ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= data[0].length; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); // rapikan tabel
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // c. Hitung total penjualan setiap menu
    public static int totalMenu(int[][] data, int indexMenu) {
        int total = 0;
        for (int j = 0; j < data[indexMenu].length; j++) {
            total += data[indexMenu][j];
        }
        return total;
    }

    // d. Cari menu dengan total penjualan tertinggi
    public static void menuTertinggi(int[][] data) {
        int maxIndex = 0;
        int maxTotal = totalMenu(data, 0);

        for (int i = 1; i < data.length; i++) {
            int total = totalMenu(data, i);
            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[maxIndex] + " dengan total " + maxTotal);
    }

    // e. Hitung rata-rata penjualan per menu
    public static double rataMenu(int[][] data, int indexMenu) {
        return (double) totalMenu(data, indexMenu) / data[indexMenu].length;
    }

    // f. Tampilkan rata-rata semua menu
    public static void rataSemuaMenu(int[][] data) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s : %.2f%n", menu[i], rataMenu(data, i));
        }
    }

    // MAIN
    public static void main(String[] args) {

        int[][] penjualan = {
            {20, 25, 10, 15, 10, 60, 10},  // Kopi
            {30, 20, 25, 10, 15, 20, 25},  // Teh
            {10, 10, 20, 25, 20, 25, 45},  // Es Kelapa
            {5, 8, 15, 17, 10, 30, 6},     // Roti Bakar
            {15, 10, 12, 18, 12, 35, 55}   // Gorengan
        };

        // Jika tugas meminta input: ganti baris di atas dengan:
        // int[][] penjualan = new int[5][7];
        // inputPenjualan(penjualan);

        tampilData(penjualan);
        menuTertinggi(penjualan);
        rataSemuaMenu(penjualan);
    }
}
