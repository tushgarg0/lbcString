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
public class p10 {
      public static void main(String [] args)
             {
                 Scanner d1= new Scanner(System.in);
                String name =d1.nextLine();
                if(name.startsWith("mr."))
                {
                    System.out.println("Gender is male");
                    
                    
                }
                else if(name.startsWith("miss."))
                {
                    System.out.println("Gender is male");
                    
                    
                }
                else if(name.startsWith("Mrs."))
                {
                    System.out.println("Married female");
                    
                    
                }
                 else if(name.endsWith("Kumari."))
                {
                    System.out.println("Gender is male");
                    
                    
                }
                  else
                  {
                      System.out.println("gender is not defined");
                  }
             }
                
    
}
