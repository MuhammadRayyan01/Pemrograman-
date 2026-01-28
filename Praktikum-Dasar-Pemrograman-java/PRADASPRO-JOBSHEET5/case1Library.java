import java.util.Scanner;//to input the boolean
public class case1Library { // main method to make java
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //prepare the boolean
    boolean idCard;
    boolean onlineRegistered ;
    //make the output
    System.out.println("did you bring your id card?" );
    idCard=input.nextBoolean();
    if (idCard==true){
         System.out.println("access granted, welcome");}
        else System.out.println("did you have registered online?");
    onlineRegistered=input.nextBoolean();

    if (onlineRegistered==true){
        System.out.println("access granted"); }
        else System.out.println("sorry you re not allowed");
    

   
}
}