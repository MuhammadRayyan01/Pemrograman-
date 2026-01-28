import java.util.Scanner;
public class arrayNilai {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int sum= 0;
    // make the for loop to input the value
int [] nilai= new int[5];
for(int i=0;i<nilai.length;i++){
    System.out.println("input  value: "+(i+1));
    nilai[i]=sc.nextInt();
    sum += nilai[i];
    //make the output using loop for
}for (int i=0;i<nilai.length;i++){
    if(nilai[i] > 70){
        System.out.println("your grade is: "+nilai[i]+", congrats, you pass!");
    }else{System.out.println("you got remidial");break;}
} System.out.println("average is: "+( sum / nilai.length));
  
}
}
