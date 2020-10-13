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
public class wipro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sen=sc.nextLine().toUpperCase();
    String a[] =sen.split(" ");
    int min=0;    
    for(int j=0;j<a.length;j++)
    {int sam=0,odd=0;
        char aa[] =a[j].toCharArray();
        for(int i=0;i<=(a[j].length())/2;i++)
    {
        if(a[j].length()%2!=0)
        {
           odd=aa[((a[j].length())/2)+1];
        }
        sam = (aa[i])-(aa[a[j].length()-i]);
           min=sam+min;     
    
    }
        
        System.out.print(min+odd);
    }
} }
