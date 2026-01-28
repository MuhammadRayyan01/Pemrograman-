import java.util.Scanner;
public class second{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  //input the  N
System.out.print("input your N: ");
int N=sc.nextInt();
    //CREATE LOOPING USING FOR
for(int iOuter=1;iOuter<=N;iOuter++){
    for(int i = 1;i <= N; i++){
    System.out.print("*");
}
System.out.println("");
}
    }
}