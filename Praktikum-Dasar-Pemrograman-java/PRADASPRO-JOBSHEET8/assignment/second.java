import java.util.Scanner;
public class second {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //input your number here
    System.out.print(" input your number: ");
    int N=sc.nextInt();
    
    //make the for loop
    for(int i=1;i<=N;i++){
        //i wil use number here
        int p=1;
        for(int j=i;j<=N;j++){
        System.out.print(p++);
        } System.out.println(" ");
        
    }

        
    

    }    
}

