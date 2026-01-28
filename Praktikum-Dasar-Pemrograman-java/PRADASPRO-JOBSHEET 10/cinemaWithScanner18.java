import java.util.Scanner;

public class cinemaWithScanner18 {   // ganti 12345 dengan StudentID/NIM kamu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        int menu = 0;

        while (menu != 3) {

            System.out.println("\n=== MINI CINEMA ===");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // consume newline

            // MENU 1: INPUT AUDIENCE DATA
            if (menu == 1) {
                int row, col;

                while (true) {
                    System.out.print("Enter row (0-3): ");
                    row = sc.nextInt();
                    System.out.print("Enter column (0-1): ");
                    col = sc.nextInt();
                    sc.nextLine(); // newline

                    // Validasi batas array
                    if (row < 0 || row >= 4 || col < 0 || col >= 2) {
                        System.out.println(" Seat does not exist! Enter again.");
                        continue;
                    }

                    // Validasi kursi sudah terisi
                    if (audience[row][col] != null) {
                        System.out.println(" Seat already taken by " + audience[row][col]);
                        System.out.println("Please choose another seat.");
                        continue;
                    }

                    // Input nama
                    System.out.print("Enter audience name: ");
                    audience[row][col] = sc.nextLine();
                    System.out.println(" Data saved!");
                    break;
                }
            }

            // MENU 2: SHOW AUDIENCE LIST
            else if (menu == 2) {
                System.out.println("\n=== AUDIENCE LIST ===");

                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] == null)
                            System.out.print("***\t");     // Kursi kosong
                        else
                            System.out.print(audience[i][j] + "\t");
                    }
                    System.out.println();
                }
            }

            // MENU 3: EXIT
            else if (menu == 3) {
                System.out.println("Exiting program...");
            }
            // INVALID MENU
          
            else {
                System.out.println("Invalid menu! Try again.");
            }
        }

        sc.close();
    }
}
