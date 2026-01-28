import java.util.*;
public class kubus {

static int calculateVol(int s){
    return s*s*s;
}
static int calculateArea(int s){
    return 6*s*s;
}    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side length: ");
    System.out.println("Volume: " + calculateVol(10));
    System.out.println("Surface Area: " + calculateArea(10));
    sc.close();
    }
}
