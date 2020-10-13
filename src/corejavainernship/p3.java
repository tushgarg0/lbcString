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
public class p3 {
  
        public static void main(String[] args) {
        
    
       Scanner d = new Scanner(System.in);
       String name=d.next();
       int aan= name.length();
      int b,c=0,e=0;
      
       for(int j=0;j<aan;j++)
       if( Character.isUpperCase(name.charAt(j)))
       {
           b++;
       }     
        else
        {
            e++;
        }
       System.out.println(c+" "+e);
        }
            
}
