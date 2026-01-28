
import java.util.Scanner;
import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //INPUT LENGTH
    System.out.print("ASSALAMUALAIKUM, HOW MANY VALUE TAHT YOU WANT TO INPUT?: ");
    int N=sc.nextInt();
    //MAKE THE ARRAY, DECLARE SUM IS 0
    int[] data=new int[N];
    int sum=0;
    //INPUT THE ARRAY VALUE EACH INDEX USING FOR
    System.out.println("input the value here:");
    for (int i= 0; i<data.length; i++) {
        data[i]=sc.nextInt();
        }
    //show the value that we input
    for (int i= 0; i<data.length; i++){
        System.out.println("-"+ data[i]);
        sum += data[i];
        }
    //calculate the avrage
    System.out.println("the average is: "+ (sum/data.length) );
    //sort from the lowest to highest
    Arrays.sort(data);
    int min=data[0];
    int max=data[data.length-1];
    System.out.println("the highest value is: "+ max+ " and the lowest was "+min);
    } 
}

    


