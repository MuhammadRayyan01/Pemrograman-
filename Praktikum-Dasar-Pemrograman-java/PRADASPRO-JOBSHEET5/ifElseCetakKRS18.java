import java.util.Scanner;
public class ifElseCetakKRS18 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("---Print KRS SIAKAD---");
        System.out.println("enter your current semester: ");
        int semester=input.nextInt();
        if(semester==1){
            System.out.println("KRS Semester 1 is displayed");
        }
        else if(semester==2){
            System.out.println("KRS Semester 2 is displayed");
        }
        else if(semester==3){
            System.out.println("KRS Semester 3 is displayed");
        }
        else if(semester==4){
            System.out.println("KRS Semester 4 is displayed");
        }
        else if(semester==5){
            System.out.println("KRS Semester 5 is displayed");
        }
        else if(semester==6){
            System.out.println("KRS Semester 6 is displayed");
        }
        else if(semester==7){
            System.out.println("KRS Semester 7 is displayed");
        }
        else if(semester==8){
            System.out.println("KRS Semester 8 is displayed");
        }
        else{
            System.out.println("invalid semester");
        }
    
}
}
/* .
1. What is the function of syntax break ?
 Answer: to end the current switch statement and transfer control to the statement immediately following the  switch.
2. What is the role of syntax default on SWITCH-CASE selection structure?
answer:  to specify a block of code to be executed if none of the case values match the switch expression.
 */

