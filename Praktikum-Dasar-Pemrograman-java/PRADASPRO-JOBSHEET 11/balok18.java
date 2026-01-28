
import java.util.Scanner;

public class balok18 {
Scanner sc = new Scanner(System.in);
//menghitung volume balok
    static int calVol(int p, int l, int t){
        return p*l*t;
    }
//menghitung luas balok
    static int calArea(int p, int l,  int t){
        return 2*(p*l + p*t + l*t);
    }    
//method utama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int l = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int t = sc.nextInt();
        System.out.println("Volume Balok: " + calVol(p,l,t));
        System.out.println("Luas Balok: " + calArea(p,l,t));
        sc.close();
    }

}
