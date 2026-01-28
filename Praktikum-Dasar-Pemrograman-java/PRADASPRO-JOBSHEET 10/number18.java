import java.util.Arrays;
public class number18 {
public static void main(String[]args){
    //DECLARE ARRAY 2 DIMENTION
int[][]myNumber=new int[3][];
myNumber[0]=new int[5];
myNumber[1]=new int[3];
myNumber[2]=new int[1];
    //1st QUESTION
for(int i=0;i<myNumber.length;i++){
    System.out.println(Arrays.toString(myNumber[i]));
}// the function is to show the element or the value for each column in each row.
 // for the default value , it will be 0 

    //2nd QUESTION
for(int i=0;i<myNumber.length;i++){
    System.out.println("length of row "+(i+1)+" : "+myNumber[i].length);
 /*  each row have different length, and it was because the column value that
     we input in the previous where the first is 5,the second is 3 and teh third 
     is 1, we can change it to the same value if we input the same value
 */
}



    }
}
