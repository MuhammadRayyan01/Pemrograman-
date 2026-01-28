import java.util.Scanner;
public class arrayRataNilai18{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int total=0;
    int[] nilai=new int[5];
    //make the for loop
        for(int i=0;i<nilai.length;i++){
            System.out.println("input the value: ");
            nilai[i]=sc.nextInt();
        } for (int i=0;i<nilai.length;i++){
            total +=nilai[i];
        } System.out.println("the sum is: "+total);
        System.out.println("your average grade is: "+total/nilai.length);
    }
    
}
