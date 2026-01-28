import java.util.Scanner;
public class DoWhileLeaveEntitlement18 {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
/*  Create variables leaveEntitlement and numLeave with int datatype */
System.out.println("input leave entitlement");
int leaveEntitlement= sc.nextInt();
int numLeave;
/*  Create variable confirmation with String datatype */
String confirmation;
sc.nextLine();
/*  make the do while loop */
do{
    System.out.println("do you want to take a leave: ");
    confirmation= sc.nextLine();
    if(confirmation.equals("y")){
        System.out.print("how many day?: ");
        numLeave = sc.nextInt();

        if (numLeave <= leaveEntitlement){
            leaveEntitlement -= numLeave;
            System.out.println("Remaining leave entitlement: "+leaveEntitlement);
        }else {
            System.out.println("you dont have enough leave entitlement");
            break;
        }

    }
}while(leaveEntitlement > 0);

    }
    
}
