import java.util.Scanner;
public class displayTwo18 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int numInput;

/*input numInput */
System.out.print("input your number: ");
numInput= input.nextInt();

/*  make the loop FOR */
for(int i=2; i<=numInput;i+=2){
System.out.print(i+", ");
}

}
    
}
