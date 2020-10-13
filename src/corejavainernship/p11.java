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
public class p11 {
      public static void main(String[] args) {
        
    
       Scanner sc= new Scanner(System.in);
            long a=sc.nextLong();
        long b=1;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if(a==1)
        {
            System.out.println(5);
        }
        else{
        for(int i=0;i<a;i++)
        {
            b=5*b;
        }
        
    String pow= Long.toString(b);
        int ba=pow.length();
        String pow2=pow.substring(ba-2);
        System.out.println(pow2);
      }}
}