import java.util.Scanner;

public class assignmentChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bintang awal: ");
        int n = sc.nextInt();  // misal 5

        // Loop untuk baris
        for (int i = n; i >= 1; i--) {
            // Loop untuk bintang di setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // pindah baris
        }

        sc.close();
    }
}
