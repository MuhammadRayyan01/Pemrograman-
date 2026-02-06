import java.util.*;
class mobil {
Scanner sc = new Scanner(System.in);
String nama;
int tahun;
public void input(){
System.out.print("my name is ");
nama=sc.nextLine();
System.out.print("tahun mobil is ");
tahun=sc.nextInt();
}
public void output(){
System.out.println("nama mobil: "+nama);
System.out.println("tahun mobil: "+tahun);
}
}
public class Car{
public static void main(String[] args) {
    mobil car1= new mobil();
    car1.input();
    car1.output();
    mobil car2 = new mobil();
    car2.input();
    car2.output();
    mobil car3= new mobil();
    car3.input();
    car3.output();
    
}
}