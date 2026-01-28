import java.util.*;

public class kafe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===WELCOME TO CAFE===");

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        Boolean isMember = sc.nextBoolean();
        sc.nextLine(); // clear buffer

        // Memilih kode promo
        System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / lainnya): ");
        String kodePromo = sc.nextLine().toUpperCase();

        // Validasi promo
        if (!kodePromo.equals("DISKON50") && !kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diterapkan.");
            kodePromo = "NONE";
        }

        // Tampilkan menu
        menu(namaPelanggan, kodePromo, isMember);

        int totalKeseluruhan = 0;
        int menuOption, quantity;

        System.out.println("\nSilakan pesan. Ketik 0 jika selesai.");

        while (true) {
            System.out.print("Masukkan nomor menu (1-3) atau 0 untuk selesai: ");
            menuOption = sc.nextInt();

            if (menuOption == 0) break;

            System.out.print("Masukkan jumlah: ");
            quantity = sc.nextInt();

            int subtotal = totalHarga(menuOption, quantity, kodePromo, isMember);
            totalKeseluruhan += subtotal;

            System.out.println("Subtotal pesanan ini: " + subtotal);
        }

        System.out.println("\n================================");
        System.out.println("Total Keseluruhan: " + totalKeseluruhan);
        System.out.println("Terima kasih, " + namaPelanggan + "!");
    }

    public static void menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("\nWelcome " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member. Diskon member berlaku.");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%.");
        }

        System.out.println("\n== CAFE MENU ==");
        System.out.println("1. KOPI  - 15000");
        System.out.println("2. SUSU  - 10000");
        System.out.println("3. TEH   - 5000");
    }

    static int totalHarga(int menuOption, int quantity, String kodePromo, boolean isMember) {
        int[] price = {15000, 10000, 5000};
        int total = price[menuOption - 1] * quantity;

        // Diskon member (misal 10%)
        if (isMember) {
            total = (int)(total * 0.90); // diskon 10%
        }

        // Diskon kode promo
        if (kodePromo.equals("DISKON50")) {
            total = total / 2;
        } else if (kodePromo.equals("DISKON30")) {
            total = (total * 70) / 100;
        }

        return total;
    }
}
