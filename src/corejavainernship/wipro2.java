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
public class wipro2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int g,total=0;  
        String a=sc.nextLine();
    String arr[] =a.split(" ");
    for(int i=0;i<arr.length;i++)
    {
        int sum=  arr[i].trim().toCharArray().length;
        total=sum+total;
    }
    while(total>10)
    {
    g=total%10;
    total=total/10;
    total=total+g;
    }
        System.out.println(total);
    }
    
}
