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
public class CoreJavaInernship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // Complete the function
        Scanner sc=new Scanner(System.in);
       String a=sc.next();
       String b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        int l=0;
        long vf=5151515;
            Long.toString(vf);
        bg.substring(l);
        char [] aa=a.toCharArray();
        char [] bb=b.toCharArray();
        for(int i=0;i<aa.length;i++)
        {
            for(int j=0;j<bb.length;j++)
            {
                if(aa[i]==bb[j])
                {
                    aa[i]=0;
                    bb[j]=0;
                l++;
                break;
                }
            }
        }
        if(aa.length==l)
        {System.out.println("anagram");
        }
        else 
        {System.out.println("no");}

    }

    }
    

