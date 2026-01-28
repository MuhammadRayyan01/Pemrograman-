import java.util.Scanner;
public class caseStudy {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String message;
     String grade;

     System.out.println("======input data mahasiswa======");

     System.out.print("Nama: ");
     String name = sc.nextLine();
   
     System.out.print("NIM: ");
     String NIM = sc.nextLine();

//algotrithm and programming

     System.out.print("Nilai UTS algorithm and programming: ");
     int nilaiUTS= sc.nextInt();

     System.out.print("Nilai UAS algoritma: ");
     int nilaiUAS = sc.nextInt();

     System.out.print("Nilai Tugas algoritma: ");
     int nilaiTugas = sc.nextInt();

//data struture

     System.out.print("Nilai UTS data structure: ");
     int nilaiUTSds= sc.nextInt();

     System.out.print("Nilai UAS data structure: ");
     int nilaiUASds = sc.nextInt();

     System.out.print("Nilai Tugas data structure: ");
     int nilaiTugasds = sc.nextInt();

//calculate algorithm grade
     double nilaiAkhir = 0.3 * nilaiTugas + 0.4 * nilaiUTS + 0.3 * nilaiUAS;

//calculate the data structure grade
     double nilaiAkhirDataStructure = 0.3 * nilaiTugasds + 0.4 * nilaiUTSds + 0.3 * nilaiUASds;

//calculate the final grade
     double averageGrade = (nilaiAkhir + nilaiAkhirDataStructure) / 2;

// make the if selection to the grade (algortihm)
if      (nilaiAkhir > 80 && nilaiAkhir <=100){ grade = "A";}
else if (nilaiAkhir > 73 && nilaiAkhir <= 80) { grade = "B+";}
else if (nilaiAkhir > 65 && nilaiAkhir <= 73) { grade = "B";}
else if (nilaiAkhir > 60 && nilaiAkhir <= 65) { grade = "C+";}
else if (nilaiAkhir >50  && nilaiAkhir <= 60) {grade="C";}
else if (nilaiAkhir >39  && nilaiAkhir <= 50) {grade="D" ;}
else    { grade = "E"; }
// make the if selection to the grade (data structure)
if      (nilaiAkhirDataStructure > 80 && nilaiAkhirDataStructure <=100){ grade = "A";}
else if (nilaiAkhirDataStructure > 73 && nilaiAkhirDataStructure <= 80) { grade = "B+";}
else if (nilaiAkhirDataStructure > 65 && nilaiAkhirDataStructure <= 73) { grade = "B";}  
else if (nilaiAkhirDataStructure > 60 && nilaiAkhirDataStructure <= 65) { grade = "C+";}
else if (nilaiAkhirDataStructure > 50 && nilaiAkhirDataStructure <= 60) {grade="C";}           
else if (nilaiAkhirDataStructure > 39 && nilaiAkhirDataStructure <= 50) {grade="D" ;}
else    { grade = "E"; }

//PRINT THE IF SELECTION TO THE GRADE
if(nilaiAkhir >= 60 && nilaiAkhirDataStructure >= 60) {
    message = "Selamat! Anda lulus mata kuliah Algoritma dan Pemrograman serta Struktur Data.";
} else if (nilaiAkhir >= 60 || nilaiAkhirDataStructure >= 60) {
    message = "Anda harus mengulang salah satu mata kuliah: Algoritma dan Pemrograman atau Struktur Data.";
} else {
    message = "Anda harus mengulang kedua mata kuliah: Algoritma dan Pemrograman serta Struktur Data.";
}

//make the selection to the pass or not pass
if(averageGrade >= 70) {
    message = "Selamat! Anda lulus mata kuliah Algoritma dan Pemrograman serta Struktur Data.";
} else {
    message = "Anda harus mengulang mata kuliah Algoritma dan Pemrograman serta Struktur Data.";
}

//print the result

     System.out.println("=====CALCULATED STUDENT GRADE =====");
     System.out.println("Nama: " + name);
     System.out.println("NIM: " + NIM);

 System.out.println("Nilai akhir algoritma: " + nilaiAkhir  );
System.out.println("Grade: " + grade);
System.out.println(message);
System.out.println("===============================");

  System.out.println("Nilai akhir data structure: " + nilaiAkhirDataStructure  );
 System.out.println("Grade: " + grade);
 System.out.println(message);
 System.out.println("===============================");

 System.out.println("average final grade: " + averageGrade  );
 System.out.println(message);


     }
}

    
