import java.util.*;
class mobil {
Scanner sc = new Scanner(System.in);
String nama;
int tahun;
public void method(){
System.out.print("my name is ");
nama=sc.nextLine();
System.out.print("my IPK is ");
tahun=sc.nextInt();
}


}
public class Car{
public static void main(String[] args) {
    mobil car1= new mobil();
    car1.nama = "honda";
    car1.tahun = 4;
    car1.method();
    mobil car2 = new mobil();
    car2.nama = "ducati";
    car2.tahun= 4;
    car2.method();

    
}
}