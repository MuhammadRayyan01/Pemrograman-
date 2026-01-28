import java.util.Scanner;

public class first{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
//input your number input
System.out.print("input your number");
int N=sc.nextInt();
//make the for loop
for (int i=1;i<=N;i++){
    //for the number i use variable p
    int p=1;
    for(int j=i;j<=N;j++){
        System.out.print(" ");
    } for(int j=1;j<=i;j++){
        System.out.print(p++);
    }
    System.out.println("");
}


 }  
}
   


