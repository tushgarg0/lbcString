
package corejavainernship;

import java.util.Scanner;


public class p17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char [] aa=a.toCharArray();
        for(int i=0;i<aa.length;i++)
        {if(Character.isUpperCase(aa[i]))
                System.out.print(Character.toLowerCase(aa[i]));                
        else
                System.out.print(Character.toUpperCase(aa[i]));
        }
        }
    
}
