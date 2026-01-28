import java.util.Scanner;

public class mataKuliah {
    // a. Fungsi isianArray
    public static void isianArray(int[] nilaiMahasiswa) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Masukkan nilai untuk setiap mahasiswa:");

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray
    public static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    // c. Fungsi hitTot → menghitung total nilai
    public static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        // memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);
        int total = hitTot(nilaiMahasiswa);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + total);
    }
}


