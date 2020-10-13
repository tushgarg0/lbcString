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
public class anagram {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String va=sc.next();
       String vb=sc.next();
   char []aa=va.toCharArray();
   char[] bb=b.toCharArray();
   for(int i=0;i<aa.length;i++)
   {
       for(int j=0;j<bb.length;b=b+1)
       {
           if(aa[i]==bb[j])
       {
           aa[i]=0;
           bb[j]=0;
       }
       }
   }
   if(aa.equals(bb))
    System.out.println("anagram");
   else
       System.out.println("anagravfbgm");
}}
