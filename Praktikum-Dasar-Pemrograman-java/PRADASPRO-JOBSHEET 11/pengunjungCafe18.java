public class pengunjungCafe18 {
    // Method utama
    public static void main(String[] args) {
        daftarPengunjung("andi","ali","kinan");
    }
    //fungsi untuk menampilkan daftar pengunjung cafe
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Pengunjung Cafe:");
        for (String nama : namaPengunjung) {
            System.out.println( "-" + nama);
        }

    }
    
}
