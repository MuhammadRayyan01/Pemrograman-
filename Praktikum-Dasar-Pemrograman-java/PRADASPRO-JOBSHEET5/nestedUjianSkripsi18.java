/* A student will register for a thesis exam. The SIMTA system will first check the
administrative requirements, that the student must be free of compensation. If this
requirement is met, the system then checks the guidance log records. To be able to register
for the exam, students must have at least 8 guidance sessions with supervisor 1 and at least
4 guidance sessions with supervisor 2. If all requirements are met, the student can proceed
to the thesis exam registration process. If not, the system will display the reason for failure.
Based on this case, a Java program is created with the following steps  */
import java.util.Scanner;
public class nestedUjianSkripsi18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.println("has the student been cleared of compensation? (yes/no)");
        String compensationStatus= sc.nextLine();

        System.out.println("Enter the number of guidance sessions with supervisor 1:");
        int guidance1 = sc.nextInt();
        
        System.out.println("Enter the number of guidance sessions with supervisor 2:");
        int guidance2 = sc.nextInt();

        if(guidance1 >= 8 && guidance2 >=4){
            message = "You can proceed to register for the thesis exam.";
        } else if( guidance2 < 8 && guidance2 <4){
            message = "failed: guidance log with supervisor 1 is fewer than 8 and guidance log with supervisor 2 is fewer than 4."; }
            else if(guidance1 < 8 && guidance2 >=4){
                message = "failed: guidance log with supervisor 1 is fewer than 8.";
            } else if(guidance1 >= 8 && guidance2 <4){
                message = "failed: guidance log with supervisor 2 is fewer than 4.";
            }   else{
                message = "student has not been cleared of compensation.";
            }
        System.out.println(message);
    }
    }

    /* 
1.What happens if a student answers " No " to compensationStatus question? Why is
that?
answe: there is no output because there is no selection for that condition
2. Explain the meaning of the following code snippet!
if (supervisor1 >= 8 && supervisor2 >= 4) {
answer: it means if the number of guidance sessions with supervisor 1 is at least 8 and the number of guidance sessions with supervisor 2 is at least 4, then the condition is true.
3. What is the student eligibility process from start to finish? Explain it in detail for all
conditions.
answer: there is 2 condition that need to be fulfilled, if there is one condition that is not fulfilled yet, even though the other condition has been fulfilled, it will be failed. in this case, A system will first check the
administrative requirements, that the student must be free of compensation. If this
requirement is met, the system then checks the guidance log records. To be able to register
for the exam, students must have at least 8 guidance sessions with supervisor 1 and at least
4 guidance sessions with supervisor 2(in line 23). If all requirements are met, the student can proceed
to the thesis exam registration process. If not, the system will display the reason for failure (from line 25 untill 32), thats why in the program, we make a various condition, using operator AND to help us solving the problem. */ 
