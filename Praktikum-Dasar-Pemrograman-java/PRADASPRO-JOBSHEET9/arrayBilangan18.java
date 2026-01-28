import java.util.Scanner;
public class arrayBilangan18 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int [] bil=new int[4];
    //Isi masing-masing elemen array bil tadi dengan angka 5, 13, -7, 17.
    bil [0]=5 ;
    bil [1]=13;
    bil [2]=-7;
    bil [3]=17;
    System.out.println(bil[0]);
    System.out.println(bil[1]);
    System.out.println(bil[2]);
    System.out.println(bil[3]);
/*Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
Answer: it will be error for the decimal number because we use int data type not double or float data type*/

//make the for loop to switch the line 9
for(int i=0;i<bil.length;i++){
    System.out.println("ini dia bilangannya: "+ bil[i]);
}

    }
    
}
/*  Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
dari program? Mengapa demikian?
Answer: it will be an error because it was more than the length of the array */
