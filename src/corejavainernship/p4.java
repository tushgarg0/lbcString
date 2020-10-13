/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavainernship;

import java.util.Scanner;

public class p4 {
  
        public static void main(String[] args) {
        
    
       Scanner d = new Scanner(System.in);
       String name=d.nextLine();
       int aan= name.length();
      int c=0,e=0;
      char ade; 
      char b;
       for(int j=0;j<aan;j++)
       {
       
        b=name.toLowerCase().charAt(j);
        if(b=='a'||b=='u'||b=='o'||b=='i'||b=='e')
        {
            c++;
        
        }
        else
        {
            e++;
        }
       
        }
            System.out.println(c+"  the number of vowal Char");
             System.out.println(e+"  the number of not vowal Char ");
        }
}

