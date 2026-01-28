import java.util.Scanner;
public class ForMultiples18{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

/* Create int variables named multiple, sum, and counter. Initialize variable sum and
counter with 0.  */
int multiple;
int sum=0;
int counter=0;

System.out.println("input the multiple: ");
multiple = sc.nextInt();

/*  make the loop FOR */
for (int i = 1; i <= 50; i++) {
    if(i % multiple ==0){
        sum = sum + i;
        counter++;
    }
    
}
/*  make the output */
System.out.printf("there are %d that are multiple of %d in range of 1 to 50\n", counter, multiple);
System.out.printf("the sum of all multiple of %d in range 1 to 50 is %d\n",multiple, sum);

/*  make the average */
double average= sum / counter;
System.out.println("the average is "+ average );


    }
}