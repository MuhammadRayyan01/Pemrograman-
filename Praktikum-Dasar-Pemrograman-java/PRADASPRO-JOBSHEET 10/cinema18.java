import java.util.Arrays;

public class cinema18 {
public static void main(String[] args){
String [][]audience=new String[4][2];
audience[0][0]="Amir";
audience[0][1]="B";
audience[1][0]="C";
audience[1][1]="D";
audience[2][0]="E";
audience[2][1]="F";
audience[3][0]="G";
audience[3][1]="H";
System.out.println("----------------------------");
System.out.println(audience.length);
for(int i=0;i<audience.length;i++){
    System.out.println("row length "+(i+1)+" is : "+ String.join(",",audience[i]));

}
System.out.println("----------------------------");
for(String[] rowAudience:audience){
    System.out.println("length of row "+ rowAudience.length);
}
System.out.println("----------------------------");
System.out.println(" loop for 3rd line:");
for(int i=0;i<audience[2].length;i++){
    System.out.println(audience[2][i]);
}
System.out.println("----------------------------");
System.out.println("for each loop 3rd line: ");
for(String thirdLine:audience[2]){
    System.out.println(thirdLine);
}
System.out.println("----------------------------");
System.out.println("string join");
for (int i=0;i<audience.length;i++){
    System.out.println("audience in the row: "+(i+1)+String.join(",",audience[i]));
}
System.out.printf(" %s\tand %s \n",audience[0][0],audience[0][1]);
System.out.printf(" %s\tand %s \n",audience[1][0],audience[1][1]);
System.out.printf(" %s\tand %s \n",audience[2][0],audience[2][1]);
System.out.printf(" %s\tand %s \n",audience[3][0],audience[3][1]);



    }
    
}
