import java.util.Arrays;
import java. util.Scanner;

public class array {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//make a list to sport
String[] sport={"badminton","tennis table","basketball","volleyball"};
//make list for the athelete (sequence from badminton, tennis table, basket ball, volleyball)
String [][] atlet={
    {"Tesa","Bagas","Sheva","Nana","Firman","Atha"}, 
    {"Wawan", "Citra", "Lina", "Agus", "Bayu"},        
    {"Eka", "Rafi", "Salsa", "Nina", "Tegar"},         
    {"Lulu", "Farhan", "Dina", "Yoga", "Karin"}       
    };

//make the for loop
 for (int i = 0; i < atlet.length; i++) {
    System.out.println( sport[i] + ":");
    Arrays.sort(atlet[i]);
 for (String name : atlet[i]) {
    System.out.println(" - " + name);
     }
    }
  }
}