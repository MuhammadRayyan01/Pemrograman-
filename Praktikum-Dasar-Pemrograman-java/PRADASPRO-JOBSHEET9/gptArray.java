import java.util.Scanner;

public class gptArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();
        int[] arrNilai = new int[jumlah];
        
        // Input nilai mahasiswa
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Proses pencarian
        int hasil = -1; // penanda belum ditemukan

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // simpan indeks tempat ditemukan
                break;     // hentikan pencarian setelah ketemu
            }
        }

        // Bagian ini hanya dieksekusi SEKALI setelah loop selesai
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

        sc.close();
    }
}

    

