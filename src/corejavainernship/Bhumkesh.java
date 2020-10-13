package corejavainernship;
import java.util.Scanner;
public class Bhumkesh {
    public static void main(String[] args) {
    int k;  char under;
    Scanner sc= new Scanner(System.in);
    String input1="_"+sc.nextLine();
    String input2=":"+sc.nextLine();
     String []input3=input2.split("\\:");
    String [] input4=input1.split("\\_");
   for(int i=1;i<input4.length;i++){
   if(input3[i].startsWith(input4[1])&&input3[i].endsWith(input4[2]))
         System.out.println(input3[i]);     
   }
}
}