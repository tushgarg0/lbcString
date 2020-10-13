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
public class p1 {
    
    public static void main(String[] args) {
        String aa;
               char a='D';
               char b='I';
               aa="scavdbgfh";
               String bb="fgstdsasc";
               int n=aa.length();
               int f;
               for(int i=0;i<n;i++)
               {
               f=aa.charAt(i)-bb.charAt(i);
               if(f<0)
               {f=f+(-2*f);
               }
               System.out.println(f);
               }
          System.out.println(a-b);}}
    
    
    
    
    
    
    }
    
    
    
    
}
