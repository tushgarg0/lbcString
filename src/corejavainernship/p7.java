/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavainernship;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class p7 {
    public static void main(String[] args)
    {
            Scanner d= new Scanner(System.in);
             String name =d.nextLine();
                int i,j;
                char q,rt;
         
         for(i=0;i<=name.length()-1;i++)
         {
             q=name.charAt(i);
             if(q>92)
             {
                 q=name.toUpperCase().charAt(i);
                 System.out.print(q);
             }
             else if(q <= 92)
              {
                     q=name.toLowerCase().charAt(i);
                     System.out.print(q);
              }
         
         
         
         
         }
         
       
    }
    
}
