import java.util.*;

//class computer
class Computer{
Scanner sc = new Scanner(System.in);

//atribut
String merk;
int tahun;
Boolean status;

//method input
void input(){
    System.out.print("Masukkan merk komputer: ");
    merk = sc.nextLine();
    System.out.print("Masukkan tahun komputer: ");
    tahun = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Apakah komputer menyala? (true/false): ");
    status = sc.nextBoolean();
}
//method output
void output(){
    System.out.println("Merk komputer: "+merk);
    System.out.println("Tahun komputer: "+tahun);
    System.out.println("Status komputer menyala: "+status);
}
}
public class Komputer {
public static void main(String[] args) {
    Computer comp1 = new Computer();
    comp1.input();
    Computer comp2 = new Computer();
    comp2.input();
    Computer comp3 = new Computer();
    comp3.input();
    System.out.println("\nData Komputer 1:");
    comp1.output();
    System.out.println("\nData Komputer 2:");
    comp2.output();
    System.out.println("\nData Komputer 3:");
    comp3.output();


}
}

