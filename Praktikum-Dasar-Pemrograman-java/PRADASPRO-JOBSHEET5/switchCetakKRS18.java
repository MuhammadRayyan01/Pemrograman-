import java.util.Scanner;
/*At the beginning of each semester, students are required to print their KRS (Student
Study Plan) for signature by their Academic Advisor. The SIAKAD system will check the
student's current semester and then display that semester's KRS for printing. Based on this
case, the Java program is created with the following steps.*/ 
public class switchCetakKRS18 
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.print("Enter your current semester: ");
        int semester = input.nextInt();

        switch(semester)
        {
            case 1:
                System.out.println("KRS Semester 1 is displayed");
                break;
            case 2:
                System.out.println("KRS Semester 2 is displayed");
                break;
            case 3:
                System.out.println("KRS Semester 3 is displayed");
                break;
            case 4:
                System.out.println("KRS Semester 4 is displayed");
                break;
            case 5:
                System.out.println("KRS Semester 5 is displayed");
                break;
            case 6:
                System.out.println("KRS Semester 6 is displayed");
                break;
            case 7:
                System.out.println("KRS Semester 7 is displayed");
                break;
            case 8:
                System.out.println("KRS Semester 8 is displayed");
                break;
            default:
                System.out.println("invalid semester");
                break;
        }
        }
    }
    /*
1.What is the function of syntax break ?
    Answer: To stop the execution of the current case and exit the switch structure.
2. What is the role of syntax default on SWITCH-CASE selection structure?
    Answer: To handle cases that do not match any of the specified case values.*/

