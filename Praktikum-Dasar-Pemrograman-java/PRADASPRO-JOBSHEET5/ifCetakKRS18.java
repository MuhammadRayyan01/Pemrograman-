//Create a new file with the name ifCetakKRSNoPresensi.java in the jobsheet5 folder that you created earlier.
//Create a basic Java program structure with the main() function.
import java.util.Scanner;

public class ifCetakKRS18 
{
    public static void main(String[]args)
    {//make the output
        Scanner sc=new Scanner(System.in);
        String message;
        System.out.println("Input the number");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            message="The number is GENAP";
        } 
        else if (number % 2 != 0) {
                message="The number is GANJIL";
        }
        else {
                message="The number is not an integer";
            }
        System.out.println(message);
           
    }}
/*
1.Why doesn't the check in the IF structure involve conditions with relational operators?
    Answer: Because the condition is already in boolean form, so it doesn't need to use relational operators.
2. When the program is run, then you enter the value false , what is the result?
    Answer: The result is "UKT Payment is not complete, you cannot print KRS"
3. The system needs to provide information that if the user enters a false value , the output will be "Registration rejected. Please pay UKT first." Modify the program by adding an
    ELSE!
*/
